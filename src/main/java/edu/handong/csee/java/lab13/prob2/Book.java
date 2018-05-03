package edu.handong.csee.java.lab13.prob2;
import java.util.Scanner;


public class Book {

	private static int idCount = 0;
	private String bookName;
	private int id;

	public Book(String name)
	{
		this.bookName = name;
		idCount++;
		id = idCount;
	}

	public String toString()
	{
		return "\n\tId: "+ id + "\n\tBook Name: " + bookName;
	}

	public void show()
	{
		System.out.println("<<<BOOK>>>" + this.toString());
	}
}
