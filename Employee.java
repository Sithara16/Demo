package org.emp;

public class Employee {
	private void empId()
	{ 
		System.out.println("Employeeid");
	}
	 private void empName()
	 {
		 System.out.println("EmployeeName");
	 }
	 private void empDob()
	 {
		 System.out.println("Emloyee Dob");
	 }
	 private void empPhone()
	 {System.out.println("EmpPhone");
	 
	 }
	 private void empEmail()
	 {
		 System.out.println("Empemail");
	 }
	 private void empAddress()
	 {System.out.println("Empaddress");
	 
	 }
	public static void main(String[] args) {
		Employee A=new Employee();
		A.empId();
		A.empName();
		A.empDob();
		A.empPhone();
		A.empEmail();
		A.empAddress();
	}
	
	

}
