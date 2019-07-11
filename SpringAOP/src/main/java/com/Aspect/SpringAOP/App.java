package com.Aspect.SpringAOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classes.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = 	new ClassPathXmlApplicationContext("classpath:/Spring.xml");
    	Student stu = (Student)ctx.getBean("studentBean");
    	stu.setName("Rohit");
    	System.out.println(stu.getName());
    }
}
