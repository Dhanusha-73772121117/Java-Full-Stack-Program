package com.dhanusha;
class TwoWheeler{
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is honda");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfWheels();
		bike.brandName();

	}

}
