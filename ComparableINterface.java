package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int rollno ;
	String name ;
	int marks ;
	
	Student(int rollno , String name , int marks )
	{
		this.rollno = rollno;
		this.name = name ;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if(this.rollno == o.rollno)
		{
			return 0 ;
		}
		else if(this.rollno > o.rollno)
		{
			return 1 ;
		}
		return -1;
	}
}

public class ComparableINterface {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(103,"naruto",100) );
		al.add(new Student(101, "luffy", 20));
		al.add(new Student(102,"zoro",80));
		al.add(new Student(105,"sanjhi",90));
		al.add(new Student(104,"nami",100));
		
		// comparable interface 

		System.out.println("--------- before sorting ------------");
		for(Student st : al )
		{
			System.out.println(st.rollno+" "+st.name+" "+st.marks);
		}
		
		System.out.println("--------- after sorting ------------");
		Collections.sort(al);
		for(Student st : al )
		{
			System.out.println(st.rollno+" "+st.name+" "+st.marks);
		}
		
		
		
	}
}
