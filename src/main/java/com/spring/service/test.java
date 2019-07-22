package com.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/service/config.xml");
		OrderBO bo= (OrderBO) context.getBean("com.spring.service.OrederBOImpl");
		bo.placeOrder();
	}

}
