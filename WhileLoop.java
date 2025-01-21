package com.Basics;

public class WhileLoop {
	public static void main(String[] args) {
		
		int n = 7 , cnt = 0 ;
		
		// cnt : 0 
		int i = 2 ; 
		while(i < n ) // 7 < 7 
		{
			if(n % i == 0 ) // 7 % 6 == 0 
			{
				cnt = cnt + 1 ;
			}
			 i = i + 1  ; // 7
		}
		if(cnt == 0 )
		{
			System.out.println("the number n = "+n+" Is s prime number ");
		}
		else
		{
			System.out.println("the number n = "+n+" Its not a prime number ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		int i = 1 ;
//		while( i <= 10 )
//		{
//			System.out.println(i);
//			i = i + 1 ;
//		}
		
		// Number in reverse order 
		/*int i = 10 ;
		while(i >= 1 )
		{
			System.out.println(i);
			i = i - 1 ;
		}
		*/
		
	}
}
