package com.Assignment41;

public class Student extends Person {

	String major;

	public Student(String name, String dateOfBirth, String major) {
		super(name, dateOfBirth);
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
