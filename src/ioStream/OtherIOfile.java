package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OtherIOfile {
public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("E:\\politics\\fhjhjj1.txt");
	
	FileOutputStream fos = new FileOutputStream("E:\\OTHER.txt");
	
	int a = 0;
	while((a = fis.read()) !=-1) {
		fos.write(a);
		System.out.println(a);
		}
}
}
