package com.Basics;

public class IfElseStatementForAge {
	public static void main(String[] args) {
		
		int a = 90 , b = 200;
		// OR ( || ) Operator  : at lease one of condition must be true 
		
		// 40 > 50 || 40 < 90 
		if (a > 50 || a < 90) {
			System.out.println("a is greater than 50 or a is less than 90");
		}
		else
		{
			System.out.println("not greater than 50 or less than 90");
		}
				
		
		/*
		// != : TRUE : a and b are diff 
		// 		False : a and b are same 
		if (a != b ) {
			System.out.println("Both are Diff ");
		}
		else
		{
			System.out.println("Both are same ");
		}
		*/
		
		/*
		// == : comparison op : returns true if a and b are same 
		// return false when a nd b are diff 
		if (a == b ) {
			System.out.println(" Both are same ");
		}
		else
		{
			System.out.println(" both are diff ");
		}
		*/
				
		/*
		int age = 170 ;
		// valid age range is 19 to 80 
		if (age > 18 && age <= 80  ) {
			System.out.println("Valid for vote ");
		}
		else if(age > 0 && age <= 18 )
		{
			System.out.println("Invalid for vote ...! ");
		}
		else
		{
			System.out.println("Person doesnt Exist ...! ");
		}
		*/
		
		// conditional statement 
		/*if(age > 18 ) // 4 > 18
		{
			// if the condition is true 
			System.out.println("valid for vote ");
		}
		else
		{
			// if the condition is false 
			System.out.println("invalid for vote ");
		}
		*/
		
		
		
	}

}
