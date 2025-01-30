package com.JavaArray;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][2];
		int[][] brr = new int[2][2];
		int[][] crr = new int[2][2];
		
		System.out.println("Enter the values of ARR matrix : = ");
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the values of BRR matrix : = ");
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				brr[i][j] = sc.nextInt();
			}
		}
		
		/* crr 		0     1
				0	19    22
				1	43	  50
			
		 */
		// matrix multiplication 
		for(int i =  0 ; i < 2 ; i++) // 
		{
			for(int j = 0 ; j < 2 ; j++) // 
			{ 
				for(int k = 0 ; k < 2 ; k++) // 
				{
					//        =  18 +( 32  ) 
					crr[i][j] = crr[i][j] + ( arr[i][k] * brr[k][j]);
				}
			}
		}
		
		System.out.println("--------- the Matrix Multiplication is ----------- ");
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = 0 ; j < 2 ;  j++)
			{
				System.out.print(crr[i][j] +"   ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
