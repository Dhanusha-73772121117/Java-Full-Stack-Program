package LabPracticeiii;
class Shape{
	double getArea() {
		return 0.0;
		
	}
}
class Rectangle extends Shape{
	double height;
	double width;
	
	Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	double getArea() {
		return width*height;
	}
}

public class MyClass3 {

	public static void main(String[] args) {
	 Rectangle rectangle=new Rectangle(40.02,20.09);
	 rectangle.getArea();
	 double area=rectangle.getArea();
	 System.out.println("Area of Rectangle: "+area);
	 

	}

}
