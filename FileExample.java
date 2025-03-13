package com.FileIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample {

	public static void main(String[] args) {

		// to get data from file
		try {
			FileInputStream fin = new FileInputStream("output.txt");
			int i = 0;
			System.out.println("--------- the data from file ------------- ");
			while ((i = fin.read()) != -1) 
			{
				System.out.print((char) i);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		// to write data into file ...

		/*
		 * try { FileOutputStream fout = new FileOutputStream("output.txt");
		 * 
		 * System.out.println("--------- The file is opened ...! "); fout.write(65);
		 * 
		 * String s = "This is the msg which has been printed to from .java file ";
		 * fout.write(s.getBytes());
		 * 
		 * System.out.println("--- The data has been printed into file ..! ");
		 * 
		 * 
		 * fout.close(); System.out.println("------- the file has been closed...! ");
		 * 
		 * } catch (Exception e) {
		 * 
		 * e.printStackTrace(); }
		 */

		/*
		 * File file = new File("D:\\JAVA INTENSHIP\\JAVA _INTERNSHIP_JAN\\output.txt");
		 * 
		 * if (file.exists()) {
		 * System.out.println("------ The File is opened ...! ----------");
		 * 
		 * System.out.println("The Lenght of the file is : = " + file.length());
		 * System.out.println("The Parent is : = " + file.getParent());
		 * System.out.println("Is Directory : = " + file.isDirectory());
		 * System.out.println("is file ? : = " + file.isFile());
		 * System.out.println("The Path : = " + file.getPath());
		 * System.out.println("the Apsolute pathe : = " + file.getAbsolutePath());
		 * System.out.println("The Name of the file is : = " + file.getName());
		 * System.out.println("Can we Read the file : = " + file.canRead());
		 * System.out.println("Can we Write the file : = " + file.canWrite());
		 * 
		 * } else {
		 * System.out.println("---------- Sorry File isnt Opened ....!------------"); }
		 */

	}
}
