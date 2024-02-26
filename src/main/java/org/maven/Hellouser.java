package java_for_beginer;

import java.io.*;

public class Hellouser {
	public static void main(String args[]) {
		String name;
		BufferedReader reader;

		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("name = ");
		try {
			name = reader.readLine();
			System.out.println("hello " + name + "!");

			System.out.println("hello \"joey\"!"); // escape code

		} catch (IOException ioe) {
			System.out.println("I/O exception occured");

		}
	}
}
