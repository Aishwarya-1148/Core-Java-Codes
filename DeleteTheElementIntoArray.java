package com.JavaArray;

import java.util.Scanner;

public class DeleteTheElementIntoArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : = ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("enter the values of teh array : =  ");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Original array is : =  ");
		for(int i = 0 ; i <arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}	
		
		System.out.println("enter the position to delete the element from array : = ");
		int delete = sc.nextInt();
		
		delete = delete - 1 ; // 3 - 1 = 2 
		
		for(int i = delete ; i < arr.length - 1 ; i ++)
		{
			arr[i] = arr[i+1 ];
		}
		
		System.out.println("array after deleting the element : = ");
		for(int i = 0 ; i < arr.length - 1  ; i++ )
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
