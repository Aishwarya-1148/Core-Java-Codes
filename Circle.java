package com.inheritance;

public class Circle extends Shape
{
	private int radius ;
	
	public Circle() {
		this.radius = 5 ;
	}
	
	public void areaOfCircle()
	{
		System.out.println("the area of Circle is : = "+radius*radius*pi);
	}
}