package com.inheritance;

class Animal
{
	private String name ;
	
	public Animal()
	{
		System.out.println("Animal()");
	}
	public Animal(String name )
	{
		this.name = name ;
	}
	
	public void displayAnimal()
	{
		System.out.println("the Name of the animal is : = "+this.name);
	}
}
class Dog extends Animal
{
	private String color;
	
	public Dog()
	{
		super();
		System.out.println("Dog()");
	}
	public Dog(String color , String name )
	{
		super(name); // call to animal constructor 
		this.color = color;
	}
	public void displayDog()
	{
		System.out.println("the Color of the Dog is : = "+this.color);
	}
}
public class CallingConstructorOfBaseClass {
	public static void main(String[] args) {
		
		Dog d = new Dog("Black","Tommy");
		d.displayAnimal();
		d.displayDog();
	}
}
