package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{//this "Rectangle" class is child of "Shape"

	private double length;//declaration of private variable "length"
	private double width;//declaration of private variable "width"
	public Rectangle(double length, double width) // this method will don't have return. It just puts value of parameter to it's variable.
	{
		this.length = length;//put value.
		this.width = width;//put value.
	}
	public double area()//a method.
	{
		return length * width;//return.
	}
	public double perimeter()//a method.
	{
		return 2*(length+width);//return.
	}
	public double get_Length()//a method.
	{
		return length;//return.
	}
	public double get_width()//a method.
	{
		return width;//return
	}
}
