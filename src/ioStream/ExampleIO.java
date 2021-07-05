package ioStream;

import java.io.File;

public class ExampleIO {

	public static void main(String[] args) {
		File file = new File("C:\\Selenium");
		System.out.println("File is make directly: "+file.mkdir());
		File[] fff = file.listFiles();
		
		for(File dd: fff) {
			System.out.println(dd.exists());
			System.out.println(dd.getName());
			System.out.println(dd.getParent());
        System.out.println("File is the Directory: "+file.isDirectory());

		
		}
	}

}
