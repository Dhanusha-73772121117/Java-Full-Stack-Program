package LabPracticeiv;

class Employee {
    double Salary;

    Employee(double Salary) {
        this.Salary = Salary;
    }
    double calculateSalary() {
        return Salary;
    }
}

class Manager extends Employee {
     double bonus;
  Manager(double Salary, double bonus) {
        super(Salary);
        this.bonus = bonus;
    }
    double calculateSalary() {
        return Salary + bonus;
    }
}

class Programmer extends Employee {
     double overtimePay;
     int overtimeHours;

    Programmer(double Salary, double overtimePay, int overtimeHours) {
        super(Salary);
        this.overtimePay = overtimePay;
        this.overtimeHours = overtimeHours;
    }
    double calculateSalary() {
        return Salary + (overtimePay * overtimeHours);
    }
}

public class MyClass3 {
    public static void main(String[] args) {
        Manager manager = new Manager(50000, 10000);
        System.out.println("Manager's Salary: " + manager.calculateSalary());

        Programmer programmer = new Programmer(40000, 50, 20);
        System.out.println("Programmer's Salary: " + programmer.calculateSalary());
    }
}
