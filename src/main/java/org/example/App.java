package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        EmployeeBeen employee1 = (EmployeeBeen) context.getBean("employee1");
        EmployeeBeen employee2 = (EmployeeBeen) context.getBean("employee2");
        EmployeeBeen employee3 = (EmployeeBeen) context.getBean("employee3");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
