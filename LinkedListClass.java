package com.CollectionFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(20);
		list.add(90);
		
		// to add element at first 
		list.addFirst(100);
		
		// to add last 
		list.addLast(200);
		
		// to add at specific index 
		list.add(2, 333);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		l2.add(44);
		l2.add(55);
		
		list.addAll(3, l2);
		
		// to sort the list 
		Collections.sort(list);
		
		System.out.println("-------- after adding l2a and sorting  ---------- ");
		itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}		
	}
}
