package com.vsachkovsky.spring_project_v1.bean_classes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog-bean has been created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
