package com.polymorphism;

public class RunTimePolyMorphism {
	public static void main(String[] args) {
		
		Animal a  = new Cat(10, "Tommy", "Persian");
		a.sound();
		a.display();
		
		a  = new Dog(10, "Simbha", "Black");
		a.sound();
		a.display();
			
		
	}
}
