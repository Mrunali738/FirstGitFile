package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOExample {
	int a = 563;
	//byte b = -128;  

	public static void main(String[] args) throws Exception {
		String Name = " ";
		FileOutputStream fos = new FileOutputStream("E:\\IOJavaFile.txt");
		byte []str = Name.getBytes();
		fos.write(str);
		while(!Name.equals("stop")){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Name");
			String name= scan.nextLine();
			System.out.println("My name is: "+Name);
			
		}
		fos.close();
		


	}

}
