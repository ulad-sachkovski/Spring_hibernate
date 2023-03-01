package com.vsachkovsky.spring_project_v1.bean_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    private Pet pet;

    private String name;

    private int age;

    @Autowired
    public Owner(@Qualifier("cat") Pet pet) {
        System.out.println("Owner-bean has been created");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Owner says: Hello, my lovely cat");
        pet.say();
    }
}
