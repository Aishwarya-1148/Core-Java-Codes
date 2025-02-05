package com.classANdObject;

import java.util.Scanner;

class Student
{
	private int id ; // data members 
	private String name; // data members 
	private int age ; // data members 
	
	public void accept() // member functions 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id : = ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the Name: = ");
		name = sc.nextLine();
		System.out.println("enter the age : = ");
		age = sc.nextInt();
	}
	public void display() // member functions 
	{
		System.out.println("Id : = "+id);
		System.out.println("Name : = "+name);
		System.out.println("Age  : = "+age);
	}	
}
public class ClassAndObject {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.accept();
		s.display();

	}
}
