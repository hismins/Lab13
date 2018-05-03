package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{//child of "Animal" and implementation of "Pet"

	public String food()//a method.
	{
		return "(Cat!)" + "Fish";//return.
	}
}
