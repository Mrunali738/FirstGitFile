package ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOStream {
	int a =563;
	public static void main(String[] args) throws Exception {
	
		FileInputStream fis = new FileInputStream("E:\\politics");

		FileOutputStream fos = new FileOutputStream("E:\\BJP.txt");
	
	  int a = 0; 
	  while((a=fis.read()) !=-1) {
		  fos.write(a); 
		  System.out.println(a);
	  }
	 
	/*File file = new File("E:\\politics");	
	File files[] = file.listFiles();
	for(File file1 : files) {
		if(file1.getName().contains("bjp")) {
			System.out.println("contains.....");
			File fbjp = new File("E:\\BJP");
			if(!fbjp.exists()) {
				//System.out.println("file success");
				fbjp.mkdir();
			}
			file.delete();
*/			
			}
	
	}


