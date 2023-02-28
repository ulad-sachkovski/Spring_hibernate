package com.vsachkovsky.test;

import com.vsachkovsky.entity.Child;
import com.vsachkovsky.entity.Section;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            ourSessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Child.class)
                    .addAnnotatedClass(Section.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {

                Child child1 = new Child("Ulad",13);
                Child child2 = new Child("Ivan",12);
                Section section1 = new Section("Football");
                Section section2 = new Section("Volleyball");
                section1.addChildToSection(child1);
                section1.addChildToSection(child2);

                session.beginTransaction();
                session.persist(section1);
                session.getTransaction().commit();

        } finally {
            session.close();
        }
    }
}