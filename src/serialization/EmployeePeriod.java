package serialization;

public class EmployeePeriod extends ExEmployee {
	
	String Course;
	int fee;
	
	public EmployeePeriod() {
		//super(Id, Name);
		this.Course = Course;
		this.fee = fee;
		super.Id = Id;
		super.Name = Name;
		
		
	}

}
/*
 * Note:If a class has a reference to another class, all the references must be
 * Serializable otherwise serialization process will not be performed. In such
 * case, NotSerializableException is thrown at Runtime
 */