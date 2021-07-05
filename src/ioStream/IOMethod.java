package ioStream;

import java.io.File;
import java.io.IOException;

public class IOMethod {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/Users/sac/Desktop/corejava.txt");
         file.createNewFile();
         System.out.println("File create Successfully");
         System.out.println("File is Execute: "+file.canExecute());          
         System.out.println("File is Exist: " +file.exists());
         System.out.println("Name of File is: "+file.getName());
         System.out.println("File is: "+file.isDirectory());
         System.out.println("File Read Successfully: "+file.canRead());
         System.out.println("Path of File is : "+file.getPath());
         System.out.println("File is deleted: "+file.delete());
         
}

}
