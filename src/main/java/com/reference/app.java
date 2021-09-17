package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.reference.refConfig.xml");

        firstClass temp = (firstClass) context.getBean("aref");
        System.out.println(temp.getObj());
    }
}
