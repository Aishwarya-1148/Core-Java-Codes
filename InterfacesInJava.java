package com.Abstraction;

interface Animal
{
	// home work :  multiple and hybrid inheritance 
	
	// rule : a class that implements an interface must define all its abstract method
	//( should provide its body ) 
	
	// functional interface : it is 
	// a inteface in which containes only one abstract method is called as functional interface 	
	
	// variables in interfaces are by default : public , static , final 
	void makeSound();
	void eat();
	
	// java 8 fetures : we can create a mothod body but that method has to be default 
	default void sample()
	{
		System.out.println("The default method from Sample() interface ...! ");
	}
	// java 9 : private methods
}
class Dog implements Animal
{
	@Override
	public void makeSound() {
		System.out.println("the Dog makes teh sound as : Woof Woof ! ");		
	}

	@Override
	public void eat() {
		System.out.println("Dog Eats Food ..! ");
	}
}
class Cat implements Animal 
{

	@Override
	public void makeSound() {
		System.out.println("The cats makes he sound as Meow Meow ..!");
	}

	@Override
	public void eat() {
		System.out.println("Cat eats the food ");
	}
	
}
public class InterfacesInJava {
	
	public static void main(String[] args) {
		
		Dog g = new Dog();
		g.makeSound();
		g.eat();
		g.sample();
		
		Cat c = new Cat();
		c.makeSound();
		c.eat();
		c.sample();
		
	
		// inteface is considered as 100% abstarction 
		// by default all the methods in interfaces are public abstarct 
		// cannot be instantialted ( can create the obj ) 
		// it is used to to achieve multiple and hybrid inheritance 
		
		// valid combinations of the classes and interface 
		// one class can implements another interface 
		// one class can extends anither class 
		// one interface can extends another interface only 
		
	}
}
