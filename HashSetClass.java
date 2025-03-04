package com.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetClass {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<>();

		hs.add("Mango");
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Banana");
		hs.add("Graps");
		hs.add("Kiwi");
//		hs.add("Kiwi");
		
		System.out.println("The hash Set is : = "+hs);
		
		// for size 
		System.out.println("The size of hash set is : = "+hs.size());
		
		// for checking whether the element is present or not 
		System.out.println("Is mango present : = "+hs.contains("Mango"));
		
		// for clearing the hash set 
		hs.clear();
		System.out.println("after clearing the hashset : = "+hs);
		
		// for is empty ?
		System.out.println("is Empty : = "+hs.isEmpty());
		
		
		
		
		
		
	}
}
