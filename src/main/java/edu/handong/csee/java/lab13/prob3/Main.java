package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {//main class.

	public static void main(String[] args) {//main method.

		double n1, n2;//declaration.
		Scanner keyboard = new Scanner(System.in);//can type with your keyboard.

		System.out.print("Enter  radius: ");//print this line.
		n1 = keyboard.nextDouble();//gets double from keyboard and puts it to "n1"
		Circle c1 = new Circle(n1);//instantiates class "Circle" with "n1"

		System.out.println("Radius:  " + c1.get_Radius());//print this line.
		c1.display();//runs display() in "c1"

		System.out.print("Eter  length and width: ");//print this line.
		n1 = keyboard.nextDouble();//gets double from keyboard and puts it to "n1" agiain.
		n2 = keyboard.nextDouble();//gets double from keyboard and puts it to "n2"
		Rectangle r1 = new Rectangle(n1, n2);//instantiates class "Circle" with "n1" and "n2"

		System.out.println("Length:  " + r1.get_Length());//print this line.
		System.out.println("Width:  " + r1.get_width());//print this line/
		r1.display();//runs display() in "r1"
	}
}

