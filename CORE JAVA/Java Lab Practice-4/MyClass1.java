package LabPracticeiv;
class Vehicles{
	void speedUp()
	{
		System.out.println("Every vehicles have their own spped capacities");
	}
}
class Car extends Vehicles{
	void speedUp() {
		System.out.println("Car: Speed is High!");
	}
}
class BiCycle extends Vehicles{
	void speedUp() {
		System.out.println("Bicycle: Speed is Low!");
	}
}
public class MyClass1{

	public static void main(String[] args) {
		Car car=new Car();
		car.speedUp();
	    BiCycle bicycle=new BiCycle();
		bicycle.speedUp();

	}

}
