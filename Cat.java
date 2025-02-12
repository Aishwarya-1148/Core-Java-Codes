package com.polymorphism;

public class Cat extends Animal{

	private String breed;
	
	public Cat(int age , String name , String breed )
	{
		super(age,name);
		this.breed = breed;
	}
		
	public void sound()
	{
		System.out.println("Cat makes the sound()");
	}
	
	public void display()
	{
		System.out.println("the Breed : = "+this.breed);
	}
}
