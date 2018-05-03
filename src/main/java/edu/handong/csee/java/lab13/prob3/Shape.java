package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {// an abstract class. it acts like both an interface and an implementation.
	
	public abstract double area();//abstract method.
	public abstract double perimeter();//abstract method.
	public void display()//a method.
	{
		System.out.println("Area:   " + area()+"\nPerimeter:" + perimeter() + "\n");//print this line.
	}

}
