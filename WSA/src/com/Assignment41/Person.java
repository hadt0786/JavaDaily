package com.Assignment41;

/**
 * Problem #41: Implement a super class Person. 
 * Make two classes, Student and Instructor, inherit from Person.
 *  A person has a name and a year of birth. A student has a major, 
 *  and an instructor has a salary. Write the class definitions, the constructors, 
 *  and the methods toString for all classes.
 *  Supply a test program that tests these classes and methods. 
 * */


public class Person {
	
	public Person(String name, String dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	String name, dateOfBirth;
	

}
