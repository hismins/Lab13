package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Main {//main class.

	public static boolean equals(int[][] m1, int[][] m2) {//parameter of this method are multi-dimension arrays and return type of this method is true or false.
		int count = 0;//declaration
		if(m1.length !=m2.length)
			return false;//returns false.
		for (int i = 0; i <m1.length; i++)//loop
		{
			for (int j = 0; j < m1[i].length; j++)//loop
			{
				if (m1[i][j] != m2[i][j])
					count++;//add 1 to "count"
			}
		}

		if(count <= 3)
			return true;//return true
		else 
			return false;//return false
	}
	public static void main(String[] args) {//main method.
		int n1, n2 = 0;//declaration.
		Scanner keyboard = new Scanner(System.in);//you can type with your keyboard.
		System.out.print("Enter row size(maximun 5): ");//print this line.
		n1 = keyboard.nextInt();//get integer.
		System.out.print("Enter column size(maximum 5): ");//print this line.
		n2 = keyboard.nextInt();//get integer

		int[][] m1 = new int[n1][n2];//instantiation of array.
		System.out.print("Enter row size(maximum 5): ");//print this line.
		n1 = keyboard.nextInt();//get integer.
		System.out.print("Enter column size(maximum 5): ");//print this line.
		n2 = keyboard.nextInt();//get integer.

		int[][] m2 = new int[n1][n2];//instantiation of array.
		System.out.print("Enter List1: ");//print this line.
		for (int i = 0; i <m1.length; i++)//loop
			for(int j = 0; j < m1[i].length; j++)//loop
				m1[i][j] = keyboard.nextInt();//get and put integer
		System.out.print("Enter List2: ");//print this line.
		for (int i = 0; i <m2.length; i++) {//loop
			for(int j = 0; j <m2[i].length; j++)//loop
				m2[i][j] = keyboard.nextInt();//get and put integer
		}
		for (int i = 0; i <m1.length; i++) {//loop
			for(int j = 0; j < m1[i].length; j++)//loop
				System.out.print(m1[i][j] + " ");//print this line
			System.out.println();//to the next line.
		}
		System.out.println();//to the next line.
		for (int i = 0; i <m2.length; i++) {//loop
			for(int j = 0; j < m2[i].length; j++)//loop
				System.out.print(m2[i][j] + " ");//print this line.
		System.out.println();//to the next line.
	}
	System.out.println();//to thoe next line

	if(equals(m1, m2))
		System.out.println("The two arrays are approximately identical.");//print this line.
	else
		System.out.println("The two arrays are not identical.");//print this line.
}
}