package LabPracticeiii;
class Vehicle {
 void drive() {
     System.out.println("Driving a vehicle");
 }
}
class Car extends Vehicle {
 void drive() {
     System.out.println("Repairing a car");
 }
}
public class MyClass2 {
 public static void main(String[] args) {
     Vehicle myVehicle = new Vehicle();
     myVehicle.drive();
     Vehicle myCar = new Car();
     myCar.drive();
 }
}

