package com.yongle.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leyangjie
 * @date 2020/12/11 13:43
 * @describe
 */
public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Student student = (Student) ac.getBean("student");
    }
}
