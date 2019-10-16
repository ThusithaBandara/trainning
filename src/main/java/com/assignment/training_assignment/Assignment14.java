package com.assignment.training_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment14 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Scanner scnm=new Scanner(System.in);
		System.out.print("Enter number of persons: ");
		int numberOfPerson=scn.nextInt();
		int per=numberOfPerson+1;
		
		ArrayList<Person> persons=new ArrayList<Person>();
		
		while(numberOfPerson>0) {
			System.out.print("Enter name of persons "+(per-numberOfPerson)+" :");
			String name=scnm.nextLine();
		
			System.out.print("Enter age of persons "+(per-numberOfPerson)+" :");
			int age=scn.nextInt();
			persons.add(new Person(name,age));
			System.out.println("Person "+(per-numberOfPerson)+" created");
			numberOfPerson--;
			
		}
		System.out.print("Person list: ");
		persons.forEach((n)->System.out.print(n.getName()+"  "));
		System.out.print("\nPerson list sorted by using the name: ");
		persons.sort((Person p1,Person p2)->p1.getName().compareTo(p2.getName()));
		persons.forEach((n)->System.out.print(n.getName()+"  "));
		

	}

}
class Person implements Comparable<Person>{
	String name;
	int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person(){}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
