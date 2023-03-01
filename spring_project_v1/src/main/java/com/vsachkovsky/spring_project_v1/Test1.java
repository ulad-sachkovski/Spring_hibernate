package com.vsachkovsky.spring_project_v1;

import com.vsachkovsky.spring_project_v1.bean_classes.Owner;
import com.vsachkovsky.spring_project_v1.my_config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.Period;

public class Test1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Owner owner = context.getBean("owner", Owner.class);
        owner.callYourPet();

        context.close();

    }

}
