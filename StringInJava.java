package com.JavaArray;

public class StringInJava {
	public static void main(String[] args) {
		// way 1 : creating string by literal 
		String str = "Mahabharat";
		
		// way 2 : creating a string by new keyword 
//		String str2 = new String("Ramayana");
		
		// length : calculating the length of the string 
		int len = str.length();
		System.out.println("the str is : = "+str+" and the length is : = "+len);
		
		// charAt(index) : character at perticular index 
		System.out.println("the character is : = "+str.charAt(4));
		
		// concat : for merging of two strings 
		String s1 = "Java";
		String s2 = " Programming";
		String result = s1.concat(s2);
		System.out.println("the string after concate operation is : = "+result);
		
		// contains : 
		String str1 = "I like java Language";
		System.out.println("Is the word java Present ? : = "+str1.contains("Java"));
		
		// imutability of string 
		// note String in a java are imutable : can not be changed ...! 
		String str2 = "Hello";
		str2.concat(" java!");
		System.out.println("The String Str2 is : = "+str2);
		
		// where are the string is been stored : string pool 
		
		// mutable String :  StringBuffer ( Sychronized ) 
		StringBuffer strbf = new StringBuffer("Hello");
		strbf.append(" World");
		System.out.println("The StringBuffer strbf : = "+strbf); // stringBuffer is mutable 
		
		
		// mutable string : StringBuilder(Non-Sychronized) 
		StringBuilder strblder = new StringBuilder("Java ");
		strblder.append("Programming");
		System.out.println("The StringBuilder strblder : = "+strblder); // stringBuilder is mutable 
		
		
	}

}
