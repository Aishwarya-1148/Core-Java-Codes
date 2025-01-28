package com.JavaArray;

import java.util.Scanner;

public class ArrayInJava {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array : = ");
		n = sc. nextInt();
		
		//syntax to create array 
		// 1D array 
		int[] marks = new int[n];
		System.out.println("Enter the 5 marks ");
		for(int i = 0 ; i < n ; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		System.out.println("The values of array are : = ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print(marks[i]+" ");		
		}
		
		System.out.println("\nthe even elements in tha array : = ");
		for(int i = 0 ; i < n ; i++)
		{
			if (marks[i] % 2 == 0 ) {
				System.out.print(marks[i]+" ");
			}
		}
		
		System.out.println("\nthe odd elements in tha array : = ");
		for(int i = 0 ; i < n ; i++)
		{
			if (marks[i] % 2 == 1 ) {
				System.out.print(marks[i]+" ");
			}
		}
		
		// to print the array in reverse  order 
		System.out.println("the array in reverse order : = ");
		for(int i = n - 1  ; i >= 0 ; i--)
		{
			System.out.println(marks[i]);
		}
		
		
		// exception : array index out off bound 
		//System.out.println("the element is : = "+marks[n]);		
	}
}
