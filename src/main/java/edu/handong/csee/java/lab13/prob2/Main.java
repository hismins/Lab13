package edu.handong.csee.java.lab13.prob2;

import java.util.Scanner;

public class Main {//main class.

	public static void main(String[] args) {//main method.

		Book book = new Book("Simple Book");//instantiates "Book" with parameter "Simple Book" as "book" 

		Science science = new Science("Hello Physics!", "ScienceWorld");//instantiation of "Science"

		History history1 = new History("What Is history?", "E.H.Carr");//instantiation of "History"
		History history2 = new History("The South Korea", "Judis");//instantiation of "History"
		
		book.show();//runs show() on instance of Book, "book"
		science.show();//runs show() on instance of Science, "science"
		history1.show();//runs show() on instance of History, "history1"
		history2.show();//runs show() on instance of History, "history2"
	}
}
