package Assignment;
import java.util.Scanner;
public class Person {
     String name;
     int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
     void Info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        Person obj1 = new Person(name, age);
        System.out.println("Person Details:");
        obj1.Info();
    }
}

