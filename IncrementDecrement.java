package com.Basics;

public class IncrementDecrement {
	public static void main(String[] args) {
		int a = 10 , x ;
		
		// rule  : shorthand property (a += 1 ) can only works with arithmetic op 
		// a = a + 1  : a += 1 
		// a = a > 1  : a >= 1  that why shorthand property cant works with relational op 
		
		// post increment operator : a++
		x = a++; 
		// step 1 : x = a 
		// step 2 : a = a + 1  : a += 1 : a++
		System.out.println("x = "+ x + " a = "+ a ); // x = 10 , a = 11
		
		// pre incment opeartor : ++a
		x = ++a ;
		// step 1 : a = a + 1 
		// step 2 : x = a 
		System.out.println("x = "+ x + " a = "+a); // x = 12, a = 12 
		
		// post decrement opeator : a--
		x = a--;
		// step 1 : x = a 
		// step 2 : a = a - 1 
		System.out.println("x = "+ x + " a = "+ a ); // x = 12, a = 11
		
		// pre decrement operator : --a
		x = --a ;
		// step 1 : a = a - 1 
		// step 2 : x = a 
		System.out.println("x = "+ x + " a = "+ a ); // x = 10, a = 10
		
		
	
		
		
	}

}
