/*
 * package com.classes;
 * 
 * import org.aspectj.lang.annotation.Aspect; import
 * org.aspectj.lang.annotation.Before;
 * 
 * @Aspect public class StudentAspect {
 * 
 * @Before("execution(public String getName())") public void getNameAdvice(){
 * System.out.println("Executing Advice on getName()");//2 }
 * 
 * @Before("execution(* com.classes.*.get*())") public void getAllAdvice(){
 * System.out.println("Service method getter called");//1 } }
 */