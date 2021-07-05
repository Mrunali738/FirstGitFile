package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTesting {
	public static void main(String[] args) {
		
		ArrayList<Student> AlStu = new ArrayList<>();
		Student stu = new Student(40,"Ram",new Phone(954523,4000));
		Student stu1 = new Student(12,"Manas",new Phone(976543,7000));
		Student stu2 = new Student(50,"Shyam",new Phone(986541,10000));
		Student stu3 = new Student(12,"Om",new Phone(912798,6500));
		AlStu.add(stu);
		AlStu.add(stu1);
		AlStu.add(stu2);
		AlStu.add(stu3);
		
		/*// Give me students having mobile with cost more than 5000
		for(Student student: AlStu) {
			Phone pp = student.phone;
			System.out.println(student.age);
			System.out.println(student.name);
		    System.out.println(pp.MobileNum); 
		    System.out.println(pp.Cost);
			  if(pp.Cost > 5000) {
			  System.out.println("Printing mob no of mob have cost > 5000: "+pp.MobileNum); }	 */
		List<Integer> list = AlStu.stream().map(X ->X.phone).map(Y ->Y.Cost)
				.filter(C ->C > 5000).collect(Collectors.toList());
		System.out.println(list);
	}
}

