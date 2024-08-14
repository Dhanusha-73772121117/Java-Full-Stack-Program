package LabPracticeiii;
class Person {
  String firstName;
  String lastName;
  Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }
  String getFirstName() {
     return firstName;
 }
  String getLastName() {
     return lastName;
 }
}
class Employees extends Person {
  String jobTitle;
  String employeeId;
  Employees(String firstName, String lastName, String jobTitle, String employeeId) {
     super(firstName, lastName);
     this.jobTitle = jobTitle;
     this.employeeId = employeeId;
 }
  String getEmployeeId() {
     return employeeId;
 }
 String getLastName() {
     return super.getLastName()+"-"+jobTitle;
 }
}
public class MyClass7 {
 public static void main(String[] args) {
     Employees emp = new Employees("Dhanusha", "Alagappan", "Software Engineer", "A104");
     System.out.println( emp.getFirstName()+" " + emp.getLastName());                  
     System.out.println("Employee ID: " + emp.getEmployeeId());       
 }
}

