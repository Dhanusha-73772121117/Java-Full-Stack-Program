package com.dhanusha;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
void display() {
	System.out.println("Employee Id:"+employeeId);
	System.out.println("Employee Name:"+employeeName);
	System.out.println("Employee Salary:"+employeeSalary);
	
}
}
public class MyClass {

	public static void main(String[] args) {
		System.out.println("Welcome to java");
		Employee emp1=new Employee(101,"Dhanusha",50000);
		emp1.display();
		Employee emp2=new Employee(101,"Hari",60000);
		emp2.display();

	}

}

