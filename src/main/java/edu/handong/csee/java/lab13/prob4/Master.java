package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class Master {//main class.

	public void feed(Pet pet)// a method.
	{
		System.out.println("feed:  " + pet.food());//print this line.
	}

	public static void main(String[] args) {//main method.
		String cat_name, dog_name;//declaration.

		Master master = new Master();//instantiation.
		Cat cat = new Cat();//instantiation.
		Dog dog = new Dog();//instantiation.

		Scanner keyboard = new Scanner(System.in);//you can type with your keyboard.
		System.out.print("Enter the cat name and dog name:  ");//print this line.
		cat_name = keyboard.next();//gets string from key board and puts to "cat_name".
		dog_name = keyboard.next();//gets string from key board and puts to "dog_name".

		cat.setName(cat_name);//runs method.
		cat.getName();//runs method.
		master.feed(cat);//runs method.

		dog.setName(dog_name);//runs method.
		dog.getName();//runs method.
		master.feed(dog);//runs method.
	}
}
