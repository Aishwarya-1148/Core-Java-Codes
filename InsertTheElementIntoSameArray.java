package com.JavaArray;

import java.util.Scanner;

public class InsertTheElementIntoSameArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : = ");
		int size = sc.nextInt();
		
		int[] arr = new int[size + 1];
		
		System.out.println("enter the values of teh array : =  ");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Original array is : =  ");
		for(int i = 0 ; i < size ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nEnter the element to insert into array : = ");
		int element = sc.nextInt();
		
		System.out.println("Enter the index to insert into array from ( 1 to "+(size+1)+") : ");
		int index = sc.nextInt();
		index--;
		
		if(index< 1 || index> size )
		{
			System.out.println("invalid position :( cant insert the element ");
			return;
		}
		
		for(int i = size ; i > index ; i--)
		{
			arr[i] = arr[i-1];
		}
		
		arr[index] = element;
		
		System.out.println("the new aray after adding element into array  : = ");
		for(int i = 0 ; i < size + 1  ; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		
	}
}
