package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{//this "Circle" class is child of "Shape"
	private double radius;//declaration.
	
	public Circle(double r)//a method.
	{
		radius = r;//puts value.
	}
	
	public double area()//a method.
	{	
		return Math.PI * Math.pow(radius, 2); //pi * r * r
	}
	
	public double perimeter()//a method.
	{
		return 2.0 * Math.PI * radius; // 2* pi * radius
	}
	
	public double get_Radius()//you can call radius by calling this method.
	{
		return radius;//return.
	}
}
