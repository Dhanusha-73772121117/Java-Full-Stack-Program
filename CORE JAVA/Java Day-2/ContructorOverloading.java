package com.dhanusha;

public class ContructorOverloading {
	ContructorOverloading(String name) {
		System.out.println("Welcome "+name);
		
	}
	ContructorOverloading(int a,int b) {
    	System.out.println("Addition: "+(a+b));
    	
    }
	ContructorOverloading(int n) {
    	int fact=1;
    	for(int i=1;i<=n;i++)
    		fact=fact*i;
    	System.out.println("Factorial: "+fact);
    	
    }
	public static void main(String[] args) {
		ContructorOverloading obj1=new ContructorOverloading(6);
		ContructorOverloading obj2=new ContructorOverloading("Dhanusha");
		ContructorOverloading obj3=new ContructorOverloading(10,20);

	}

}

