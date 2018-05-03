package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{//class "Science" was extended from "Book".

	private String publisher;//declaration
	public Science(String name, String publisher)//a method.
	{
		super(name);//can use "name" in parent class "Book"
		this.publisher = publisher;//puts parameter "publisher" to "publisher" in this method.
	}
	public String toString()//toString() method.
	{
		return super.toString() + "\n\tpublisher: " + publisher;// As a return value, prints this line.
	}
	public void show()//this method will show Book's name.
	{
		System.out.println("<<<Science>>>" + this.toString());//print this line.
	}
}