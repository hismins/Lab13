package edu.handong.csee.java.lab13.prob2;
import java.util.Scanner;


public class Book { // a class.

	private static int idCount = 0; //declaration and iteration of private integer type variable "idCount".
	private String bookName;//declaration of String type private variable "bookName".
	private int id;//declaration of private integer type variable "id"

	public Book(String name)//a method which get "name" as parameter.
	{
		this.bookName = name;//puts "name" to "book.name" in this method.
		idCount++;//and add 1 to "idCount"
		id = idCount;// puts value of "idCount" to "id"
	}

	public String toString()//toString method's return type will be String. 
	{
		return "\n\tId: "+ id + "\n\tBook Name: " + bookName; // As a return value, prints this line.
	}

	public void show() //this method will show Book's name.
	{
		System.out.println("<<<BOOK>>>" + this.toString());//print this line.
	}
}
