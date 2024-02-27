package java_for_beginer;

import java.io.*;

public class Hellouser {
	public static void main(String args[]) {
		String name;
		// we use a inbulit class known as buffered and create an object named reader for the buffered class.
		BufferedReader reader;

		reader = new BufferedReader(new InputStreamReader(System.in));
		// initializing the reader class with another inbuilt function called InputStreamReader to take input from user.
		System.out.print("name = ");
		// using try and catch methods to handle exception occured during compile time.
		// try method will try the block of code written inside method and if any exception is occured,the catch method will be invoked
		try {
			name = reader.readLine();
			System.out.println("hello " + name + "!");

			System.out.println("hello \"joey\"!"); // escape code

		} catch (IOException ioe) {      // herecatch method will catch input output exception which is occured while taking or printing the name from user.the following string will be printed 
			System.out.println("I/O exception occured");

		}
	}
}
