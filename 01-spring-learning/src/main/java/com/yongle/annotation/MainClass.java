package com.yongle.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author leyangjie
 * @date 2020/12/11 13:48
 * @describe
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }
}

