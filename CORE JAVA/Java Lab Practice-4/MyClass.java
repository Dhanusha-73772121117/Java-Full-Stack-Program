package LabPracticeiv;
class Animalsss{
	void sound()
	{
		System.out.println("All animals have their own  sounds");
	}
}
class Birdsss extends Animalsss{
	void sound() {
		System.out.println("Birds have some sweet sounds like : !Quik Quik!");
	}
}
class Cats extends Animalsss{
	void sound() {
		System.out.println("cats have some screming sounds like : !Meow Meow!");
	}
}
public class MyClass {

	public static void main(String[] args) {
		Birdsss bird=new Birdsss();
		bird.sound();
		Cats cat=new Cats();
		cat.sound();

	}

}
