package com.flytxt.training.car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarBuilder {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("car.spring.xml");
		
		Car budgetCar = applicationContext.getBean("budgetCar", Car.class);
		Car premiumCar = applicationContext.getBean("premiumCar", Car.class);
		
		System.out.println("Budget Car:");
		System.out.println(budgetCar);
		System.out.println("Premium Car:");
		System.out.println(premiumCar);
		
		applicationContext.close();
		
	}

}
