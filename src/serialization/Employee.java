package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
		 int empNo;
		 String empName;
		 int empSal;
		 
		 public int getEmpNo() {
			 return empNo;
		 }
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpSal() {
			return empSal;
		}
		public void setEmpSal(int empSal) {
			this.empSal = empSal;
		}
		
	}


