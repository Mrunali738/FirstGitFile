package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class txtfilecopy {
	int a = 126;

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\politics\\aap1.txt");
		//FileInputStream fis1 = new FileInputStream("E:\\politics\\aap2.txt");
		//FileInputStream fis3 = new FileInputStream("E:\\politics\\aap3.txt");

		
		FileOutputStream fos = new FileOutputStream("E:\\AAP.txt");
		
		int a = 0;
		while((a=fis.read()) !=-1) {
			fos.write(a);
			System.out.println(a);
		}
		
		
	}

}
