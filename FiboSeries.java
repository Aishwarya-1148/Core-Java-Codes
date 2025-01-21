package com.Basics;

public class FiboSeries {
	public static void main(String[] args) {
		
		
		// for fibo series 
		int n1 = 0 ,  n2 = 1 , n3  , n = 10 ;
		System.out.print(n1+"  "+n2+"  ");
		
		for(int i = 3 ;i <= 10 ; i = i + 1  )
		{
			n3 = n1 + n2 ;
			System.out.print(n3+"  ");
			n1 = n2 ;
			n2 = n3 ;
		}
		
		
	}
}
