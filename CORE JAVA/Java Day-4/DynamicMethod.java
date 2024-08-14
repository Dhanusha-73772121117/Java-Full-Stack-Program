package com.dhanusha;

class Animals{
	int a=10;
	void move() {
		System.out.println("All animals move from one place to another");
	}
	void eat() {
		System.out.println("All aniamls eat something");
	}
}
class Dogs extends Animals{
	int a=20;
	void move() {
		System.out.println("Dog will move by walking");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
class Birds extends Animals{
	void move() {
		System.out.println("Birds will move by Flying");
	}
	void eat() {
		System.out.println("Birds will eat nuts");
	}
}
class Fishes extends Animals{
	void move(){
		System.out.println("Fishes will move by Swimming");
	}
	void eat() {
		System.out.println("Fishes can eat Small fish");
	}
}

public class DynamicMethod {

	public static void main(String[] args) {
		Animals animal;
		animal =new Dogs();
		animal.move();
		animal.eat();
		animal=new Birds();
		animal.move();
		animal.eat();
		animal=new Fishes();
		animal.move();
		animal.eat();
		
		System.out.println(animal.a);

	}

}
