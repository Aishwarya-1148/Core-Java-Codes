package com.inheritance2;


import com.inheritance.*;

public class ProtectedExample {
public static void main(String[] args) {
		
		
		Circle c = new Circle();	
		//c.pi = 11.22;	// invalid because its protected 
		c.areaOfCircle();		
			
	}
}
