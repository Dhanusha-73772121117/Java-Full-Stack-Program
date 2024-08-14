package com.dhanusha;

class Animal{
	void move() {
		System.out.println("All animals move from one place to another");
	}
	void eat() {
		System.out.println("All aniamls eat something");
	}
}
class Dog extends Animal{
	void move() {
		System.out.println("Dog will move by walking");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
class Bird extends Animal{
	void move() {
		System.out.println("Birds will move by Flying");
	}
	void eat() {
		System.out.println("Birds will eat nuts");
	}
}
class Fish extends Animal{
	void move(){
		System.out.println("Fishes will move by Swimming");
	}
	void eat() {
		System.out.println("Fishes can eat Small fish");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Dog dog =new Dog();
		dog.move();
		dog.eat();
		Bird bird=new Bird();
		bird.move();
		bird.eat();
		Fish fish=new Fish();
		fish.move();
		fish.eat();

	}

}
