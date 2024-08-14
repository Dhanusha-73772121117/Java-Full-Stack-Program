package LabPracticeiii;
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat meows");
    }
}
public class MyClass1 {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
        myAnimal.makeSound(); 
        Cat cat=new Cat();
        cat.makeSound();

	}

}
