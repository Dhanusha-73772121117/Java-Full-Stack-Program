package LabPracticeiii;
class Employee {
 void work() {
     System.out.println("Employee is working");
 }
 double getSalary() {
     return 30000.0; 
 }
}
class HRManager extends Employee {
 void work() {
     System.out.println("HR Manager is working on employee relations");
 }
 void addEmployee(String employeeName) {
     System.out.println("Adding a new employee: " + employeeName);
 }
}
public class MyClass4 {
 public static void main(String[] args) {
     HRManager hrManager = new HRManager();
     hrManager.work();
     hrManager.addEmployee("Dhanusha");
     System.out.println("HR Manager's salary: " + hrManager.getSalary());
 }
}
