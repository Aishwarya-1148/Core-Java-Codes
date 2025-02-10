package com.inheritance;

public class MultilevelInheritance {
	
	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar();
		sc.setVno(1111);
		sc.setName("BMW");
		sc.setPrice(2000000);
		sc.setAlarm("Yes");
		sc.setNavigation("Yes");
		sc.setSpeed(300);
		
		System.out.println(" ------------------ the details of Sports car is ------------------ ");
		System.out.println("Sports car No : = "+sc.getVno());
		System.out.println("Sports car Name : = "+sc.getName());
		System.out.println("Sports car Price : = "+sc.getPrice());
		System.out.println("Sports car Alarm : = "+sc.getAlarm());
		System.out.println("Sports car Navigation: = "+sc.getNavigation());
		System.out.println("Sports car Speed: = "+sc.getSpeed());
		
	}
}
