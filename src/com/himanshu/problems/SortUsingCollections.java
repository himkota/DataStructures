package com.himanshu.problems;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingCollections{

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>(); 
		people.add(new Person("Vanyaa",5));
		people.add(new Person("Olisha",1));
		people.add(new Person("hims",36));
		people.add(new Person("neha",34));
		System.out.println("before sorting");
		display(people);
		System.out.println("after sorting");
		Collections.sort(people);
		display(people);
	}
	
	static void display(ArrayList<Person> people){
		for (Person person : people) {
			System.out.println("Person : " + person.name + " : " + person.age);
		}
	}

}

class Person implements Comparable<Person>{
	public String name;
	public int age;
	public Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person p) {
		return this.age-p.age;
	}
}