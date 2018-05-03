package edu.handong.csee.java.lab13.prob6;

public class Printer {// class.

	public static void print(Object object)//a method.
	{
		String str = object.toString();//puts value
		if(object instanceof CapitalPrint)
			str = str.toUpperCase();//put value
		System.out.println(str);//print this line.
	}
}
