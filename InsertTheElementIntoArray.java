package com.JavaArray;

import java.util.Scanner;

public class InsertTheElementIntoArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : = ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("enter the values of teh array : =  ");
		for(int i = 0 ; i < size ; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("The Original array is : =  ");
		for(int i = 0 ; i < array.length ; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println("Enter the element to insert into array : = ");
		int element = sc.nextInt();
		
		System.out.println("Enter the position to insert into array from ( 1 to "+(size+1)+") : ");
		int position = sc.nextInt();
		
		if(position < 1 || position > size )
		{
			System.out.println("invalid position :( cant insert the element ");
			return;
		}
		
		int[] newArray = new int[size + 1 ];
		
		// pos = 3-1 = 2 , ele = 55
		for(int i = 0  , j = 0 ; i < newArray.length ; i++)
		{
			if (i == position - 1 ) {
				newArray[i] = element;
			}
			else
			{
				newArray[i] = array[j]; 
				j++;
			}
		}
		
		System.out.println("the new aray after adding element into array  : = ");
		for(int i = 0 ; i < newArray.length ; i++)
		{
			System.out.print(newArray[i] +" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
