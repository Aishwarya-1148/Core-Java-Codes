package com.Basics;

public class SwicthCaseExample {
	public static void main(String[] args) {
		System.out.println("-------------  Menu -------------  ");
		System.out.println("1 : Area Of Circle ");
		System.out.println("2 : Area Of Rectangle");
		System.out.println("3 : Area Of Square");
		
		int choice = 5 , radius = 5 , length = 3, width = 5 , side = 7;
		
		switch(choice)
		{
		case 'a' : 
				double areaOfCircle = 3.14 * radius * radius ;
				System.out.println("The Area of  Circle is : = "+areaOfCircle);
				break;
		case 65 : 
				int areaOfReactangle = length * width;
				System.out.println("The Area of  Reactangle is : = "+areaOfReactangle);
				break;
		case 3 : 
				int areaOfSquare = side * side ;
				System.out.println("The Area of Square is : = "+areaOfSquare);
				break;
		default:System.out.println(" invalid choice ....! ");
		}
		
		
		
	}
}
