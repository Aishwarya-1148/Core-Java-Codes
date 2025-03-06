package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	int id ;
	String name ;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

class SalaryCompartor implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary == o2.salary)
		{
			return 0 ;
		}
		else if (o1.salary > o2.salary )
		{
			return 1 ;
		}
		return -1;
	}
	
}

class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorInterface {
	public static void main(String[] args) {
			
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(11, "luffy", 10000));
		al.add(new Employee(77, "nami", 50000));
		al.add(new Employee(88, "sanjhi", 90000));
		al.add(new Employee(44, "robin", 20000));
		al.add(new Employee(55, "zoro", 40000));
		al.add(new Employee(33, "chopper", 80000));
		
		System.out.println("-------- before Sorting by Salary -----------");
		
		for(Employee e : al )
		{
			System.out.println(e.id + " "+e.name+" "+e.salary);
		}
		
		Collections.sort(al,new SalaryCompartor() );
		
		System.out.println("-------- after Sorting by Salary -----------");
		
		for(Employee e : al )
		{
			System.out.println(e.id + " "+e.name+" "+e.salary);
		}
		
		System.out.println("-------- before Sorting by name -----------");
		
		for(Employee e : al )
		{
			System.out.println(e.id + " "+e.name+" "+e.salary);
		}
		
		Collections.sort(al,new NameComparator() );
		
		System.out.println("-------- after Sorting by name -----------");
		
		for(Employee e : al )
		{
			System.out.println(e.id + " "+e.name+" "+e.salary);
		}
		
	}
}
















