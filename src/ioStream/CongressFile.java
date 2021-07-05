package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CongressFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\politics\\4cong.txt");
		
		FileOutputStream fos = new FileOutputStream("E:\\CONG.txt");
		
		int a = 0;
		while((a = fis.read()) !=-1){
			fos.write(a);
			System.out.println(a);
		}
	}

}
