package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// to check whether the list is empty or not 
		System.out.println("the lsit is empty : = "+list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// to check the size of the array list 
		System.out.println("the size of the array list is : = "+list.size());
		
		// to see the list 
		System.out.println("-----  before removing the list is -------- ");
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
					
		// to remove the element 
		list.remove(3);
		
		// way 1 : to iterate 
		// to see the list 
		System.out.println("-----  after removing the list is -------- ");
		for(int i = 0 ; i < list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
			
		// way 2 : to iterate 
		for(int i : list)
		{
			System.out.println(i);
		}
		
		ArrayList<Integer> l2 = new ArrayList<>();
		
		l2.add(60);
		l2.add(70);
		l2.add(80);
		l2.add(90);
		l2.add(100);
		
		list.addAll(l2);
		
		list.add(1, 22);
		
		System.out.println("-----------  after adding list -------------");
		// way 2 : to iterate 
		for(int i : list)
		{
			System.out.println(i);
		}
				
		System.out.println("-------- using iterator ---------- ");
		// way 3 : to iterate 
		Iterator<Integer> itr =  list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
	}
}
