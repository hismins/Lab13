package edu.handong.csee.java.lab13.prob6;

public class Main {//main class

	public static void main(String[] args) {//main method.
		UpPoint p1 = new UpPoint(3, 3);//implementation
		DownPoint p2 = new DownPoint(2, 5);//implementation
		DownPoint p3 = new DownPoint(4, 7);//implementation
		UpPoint p4 = new UpPoint(9, 12);//implementation
		Printer.print(p1);//runs method.
		Printer.print(p2);//runs method.
		Printer.print(p3);//runs method.
		Printer.print(p4);//runs method.
	}
}
