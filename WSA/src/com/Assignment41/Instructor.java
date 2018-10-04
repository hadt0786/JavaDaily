package com.Assignment41;

public class Instructor extends Person {
	
	double salary;

	@Override
	public String toString() {
		return "Instructor [salary=" + salary + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public Instructor(String name, String dateOfBirth, double salary) {
		super(name, dateOfBirth);
		this.salary = salary;
	}

}
