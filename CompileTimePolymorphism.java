package com.polymorphism;

public class CompileTimePolymorphism 
{
	public static void main(String[] args) 
	{
		
		MathematicalOperation m = new MathematicalOperation();
		
		System.out.println("----  without any parametr ---- ");
		m.opeartion();
		
		System.out.println("---- by passing 2 ints ------ ");
		m.opeartion(10,20);
		
		System.out.println("---- by passing only one int ----- ");
		m.opeartion(10);
		
		// not a good programming practice 
//		int c = m.operation();
//		System.out.println("the addition is : = "+c);
		
	}
}
