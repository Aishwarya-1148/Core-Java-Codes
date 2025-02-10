package com.inheritance;


public class SingleInheritance {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setVno(1234);
		c.setName("Rolls Royce");
		c.setPrice(1000000);
		c.setAlarm("Yes");
		c.setNavigation("Yes");

		System.out.println(" ------------------ the details of car is ------------------ ");
		System.out.println("Car No : = "+c.getVno());
		System.out.println("Car Name : = "+c.getName());
		System.out.println("Car Price : = "+c.getPrice());
		System.out.println("Car Alarm : = "+c.getAlarm());
		System.out.println("Car Navigation: = "+c.getNavigation());
		
	}
}
