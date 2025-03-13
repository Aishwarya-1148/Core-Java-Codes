package com.FileIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable {
	int id;
	String name;
}
public class SerializationExample {
	public static void main(String[] args) {

		// Serialization : converting obj into  byte Stream  
		Student s = new Student();
		s.id = 101;
		s.name = "Rameshwar";

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"));

			oos.writeObject(s);
			System.out.println("------ Data is Serialised ------ ");
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
