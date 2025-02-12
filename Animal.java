package com.polymorphism;

public class Animal {
	
	private int age ;
	private String name ;
	
	public Animal(int age , String name )
	{
		this.age = age;
		this.name = name ;
	}
	public void sound()
	{
		System.out.println("Animal makes the sound()");
	}
	
	public void display()
	{
		System.out.println("the name : = "+this.name+" age : = "+this.age);
	}
}
