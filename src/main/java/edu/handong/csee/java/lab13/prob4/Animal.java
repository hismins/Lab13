package edu.handong.csee.java.lab13.prob4;

public class Animal {//a class.

	private String name;//declaration.
	
	public void setName(String name)//method setName().
	{
		this.name = name;//puts parameter value to "name" in this method.
	}
	
	public void getName()//method getName().
	{
		System.out.println("name:  " + name);//print this line.
	}
}
