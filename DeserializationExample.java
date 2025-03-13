package com.FileIo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String[] args) {

		// Deserialization : converting byte Stream into obj

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("output.txt"));
			Student s = (Student)ois.readObject();
			
			System.out.println("The id is : = "+s.id);
			System.out.println("The name is : = "+s.name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
