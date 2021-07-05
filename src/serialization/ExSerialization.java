package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ExSerialization {

	public static void main(String[] args) {
		try {
		EmployeePeriod Emp = new EmployeePeriod();
			Emp.Id = 50;
			Emp.Name = "java";
			Emp.Course = "Software Testing";
			Emp.fee = 6000;
			
			FileOutputStream fout = new FileOutputStream("C:\\Users\\sac\\Desktop\\corejava.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(Emp);
			out.flush();
			System.out.println("Serialization is Completed");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
