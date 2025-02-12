package com.polymorphism;

public class Dog extends Animal{
private String color;
	
	public Dog(int age , String name , String color )
	{
		super(age,name);
		this.color = color;
	}
		
	public void sound()
	{
		System.out.println("Dog makes the sound()");
	}
	
	public void display()
	{
		System.out.println("the color : = "+this.color);
	}
}
