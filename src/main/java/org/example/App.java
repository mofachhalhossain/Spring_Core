package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        EmployeeBeen employee1 = (EmployeeBeen) context.getBean("employee");

        System.out.println(employee1);
    }
}
