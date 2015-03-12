package com.flytxt.training.autowire.car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarBuilder {
	
	public static void main(String[] args) {
		
		String carConfigXml = args[0];
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(carConfigXml);
		
		Car car = applicationContext.getBean("car", Car.class);
		
		System.out.println("Car:");
		System.out.println(car);

		applicationContext.close();
		
	}

}
