package com.dhanusha;

public class ThisOverlading{
	ThisOverlading(String name) {
		System.out.println("Welcome "+name);
		
	}
	ThisOverlading(int a,int b) {
		this("Dhanusha");
    	System.out.println("Addition: "+(a+b));
    	
    }
	ThisOverlading(int n) {
		this(10,20);
    	int fact=1;
    	for(int i=1;i<=n;i++)
    		fact=fact*i;
    	System.out.println("Factorial: "+fact);
    	
    }
	public static void main(String[] args) {
		ThisOverlading obj1=new ThisOverlading(6);

	}

}

