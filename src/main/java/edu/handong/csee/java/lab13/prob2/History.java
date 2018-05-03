package edu.handong.csee.java.lab13.prob2;

public class History extends Book {//class "History" was extended from "Book".
	private String author; //declaration.

	public History(String name, String author)//a method.
	{
		super(name);//can use "name" in parent class "Book"
		this.author = author;//puts parameter "author" to "author" in this method.
	}
	public String toString()//toString() method.
	{
		return super.toString() + "\n\tAuthor: " + author;// As a return value, prints this line.
	}
	public void show()//this method will show Book's name.
	{
		System.out.println("<<<History>>>" + this.toString());//print this line.
	}
}
