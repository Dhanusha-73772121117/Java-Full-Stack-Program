package LabPracticeiii;
class Animal {
 void move() {
     System.out.println("The animal moves");
 }
}
class Cheetah extends Animal {
 void move() {
     System.out.println("The cheetah runs very fastly");
 }
}
public class MyClass6 {
 public static void main(String[] args) {
     Animal genericAnimal = new Animal();
     genericAnimal.move();
     Animal cheetah = new Cheetah();
     cheetah.move();
 }
}

