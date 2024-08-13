package Assignment;

public class Dog {
	String dogName;
	String dogBreed;
	
	Dog(String dogName,String dogBreed){
		this.dogName=dogName;
		this.dogBreed=dogBreed;
	}
	void setName(String dogName) {
		this.dogName=dogName;
	}
	void setBreed(String dogBreed) {
		this.dogBreed=dogBreed;
	}
	void getName(String dogName) {
		this.dogName=dogName;
	}
	void getBreed(String dogBreed) {
		this.dogBreed=dogBreed;
	}
	void display() {
		System.out.println("Dog Name: "+dogName);
		System.out.println("Dog Breed: "+dogBreed);
	}
	

	public static void main(String[] args) {
		Dog obj1=new Dog("Silkie","Pomeranian");
		Dog obj2=new Dog("Tony","Husky");
		System.out.println("Original variety");
		obj1.display();
		obj2.display();
		obj1.setName("Tomy");
		obj1.setBreed("Labrador");
		obj2.setName("Febi");
		obj2.setBreed("Labrador");
		System.out.println("Modified variety");
		obj1.display();
		obj2.display();
		
	}

}
