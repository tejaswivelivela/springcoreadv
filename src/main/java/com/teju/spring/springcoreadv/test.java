package com.teju.spring.springcoreadv;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class test {
public static void main(String[] args){
	ApplicationContext context = new ClassPathXmlApplicationContext("com/teju/spring/springcoreadv/config.xml");
	Employee e = (Employee) context.getBean("employee");
	System.out.println(e);
	
}
}
