package com.lambdaproject;
interface Calculations
{
	void add(int i,int j);
	default void mul(int i,int j)
	{
		int m=i*j;
		System.out.println("Calculations interface product ="+m);
	}
	static void sub(int i,int j)
	{
		int s=i-j;
		System.out.println("difference="+s);
	}
}
interface MyCalculation
{
	void display();
	default void mul(int i,int j)
	{
		int m=i*j;
		System.out.println("MyCalculation interface product ="+m);
	}
	
}

public class DefaultMethodJ8Features implements Calculations ,MyCalculation{

	@Override
	public void add(int i, int j) {
		int add=i+j;
		System.out.println("addition ="+add);
		
	}
	@Override
	public void display() {
		System.out.println("MyCalculation display abstract method");
		
	}
	@Override
	public void mul(int i, int j) {
		
		Calculations.super.mul(9, 10);
		MyCalculation.super.mul(3, 3);
	}
	public static void main(String[] args) 
	{
		DefaultMethodJ8Features ob=new DefaultMethodJ8Features();
		ob.add(1, 4);
		ob.mul(1, 5);
		Calculations.sub(10, 5);
		ob.display();

	}
	

	

}
