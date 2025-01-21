package com.Basics;

import java.util.Scanner;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		int choice = 5 , radius = 5 , length = 3, width = 5 , side = 7;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("-------------  Menu -------------  ");
			System.out.println("1 : Area Of Circle ");
			System.out.println("2 : Area Of Rectangle");
			System.out.println("3 : Area Of Square");
			
			System.out.println("Enter the choice : = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : 
					double areaOfCircle = 3.14 * radius * radius ;
					System.out.println("The Area of  Circle is : = "+areaOfCircle);
					break;
			case 2 : 
					int areaOfReactangle = length * width;
					System.out.println("The Area of  Reactangle is : = "+areaOfReactangle);
					break;
			case 3 : 
					int areaOfSquare = side * side ;
					System.out.println("The Area of Square is : = "+areaOfSquare);
					break;
			default:System.out.println(" invalid choice ....! ");
			}
			
		}while( choice != 0 );
		
		System.out.println("end off main ...! ");
		
		
	}
}
