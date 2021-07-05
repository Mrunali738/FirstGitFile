package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) {
		try {
		Employee emp = new Employee();  // Creating the object
		emp.setEmpSal(2000);
		emp.setEmpName("jbk");
		emp.setEmpNo(20);
		// Creating stream and writing the object
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sac\\Desktop\\corejava.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);	
		oos.flush();
		// closing the stream
		oos.close();
		System.out.println("Serialization is done.....");
		}catch(Exception e) {
			e.printStackTrace();		
			}
		
	}

}
