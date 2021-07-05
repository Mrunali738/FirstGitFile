package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationTest {

	public static void main(String[] args) {
		try{
			// Creating stream to read the object
			FileInputStream fis = new FileInputStream("C:\\Users\\sac\\Desktop\\corejava.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee)ois.readObject();
			// printing the data of the serialized object
			System.out.println(emp.empNo+" "+emp.empName+" "+emp.empSal);
			// closing the stream
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
