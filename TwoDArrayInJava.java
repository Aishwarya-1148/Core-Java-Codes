package com.JavaArray;

import java.util.Scanner;

public class TwoDArrayInJava {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = 3 , n = 3 ;
		
		// declartion of 1D array 
		int[] array = new int[2];
		
		// Declaration of 2D array : first subscript op indicates the number of rows 
		// Secoond subscript op indicates the number cols
		int[][] arr = new int[m][n];
		int[][] brr = new int[m][n];
		int[][] crr = new int[m][n];
		
		
		System.out.println("--------  enter the 9 elements for ARR----------- ");
		for(int i = 0 ; i < m ; i++)// rows 
		{
			for(int j = 0 ; j < n ; j++) // cols 
			{
				System.out.print("enter the arr["+i+"]["+j+"] : = ");
				arr[i][j] = sc.nextInt();
				System.out.println();
			}
		}
		
		System.out.println(" ------- the elements of ARR ------------ \n");
		for(int i = 0 ; i < m ; i++)// rows 
		{
			for(int j = 0 ; j < n ; j++) // cols 
			{
//				System.out.print("arr["+i+"]["+j+"] : = "+arr[i][j]);
				System.out.print("| "+arr[i][j]+" |");
			}
			System.out.println();
		}
		
		System.out.println("--------  enter the 9 elements for BRR----------- ");
		for(int i = 0 ; i < m ; i++)// rows 
		{
			for(int j = 0 ; j < n ; j++) // cols 
			{
				System.out.print("enter the arr["+i+"]["+j+"] : = ");
				brr[i][j] = sc.nextInt();
				System.out.println();
			}
		}
		
		System.out.println(" ------- the elements of BRR ------------ \n");
		for(int i = 0 ; i < m ; i++)// rows 
		{
			for(int j = 0 ; j < n ; j++) // cols 
			{
//				System.out.print("arr["+i+"]["+j+"] : = "+arr[i][j]);
				System.out.print("| "+brr[i][j]+" |");
			}
			System.out.println();
		}
		
		// Addition of CRR = ARR + BRR 
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				crr[i][j] = arr[i][j] + brr[i][j] ;
			}
		}
		
		// the CRR is -------- 
		
		System.out.println(" ------- The Addition of CRR = ARR + BRR is ------------ \n");
		for(int i = 0 ; i < m ; i++)// rows 
		{
			for(int j = 0 ; j < n ; j++) // cols 
			{
				System.out.print("| "+crr[i][j]+" |");
			}
			System.out.println();
		}
	
		
	}
}
