package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ExDeserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\sac\\Desktop\\corejava.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			EmployeePeriod Emp = (EmployeePeriod)in.readObject();
			System.out.println(Emp.Id +" "+ Emp.Name +" "+ Emp.Course +" "+ Emp.fee);
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}
