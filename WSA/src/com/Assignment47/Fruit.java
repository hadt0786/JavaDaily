package com.Assignment47;

/**
 * • Problem #47: .Define a class called fruit with the following attributes: •
 * Name of the fruit. • Single fruit or bunch fruit. • Price. Define a suitable
 * constructor and displayFruit() method that displays values of all the
 * attributes. Write a program that creates 2 objects of fruit class and display
 * their attributes.
 */

enum FruitType {
	APPLE, BANANA, GRAPES,
}

public class Fruit {

	String name;
	int price;
	FruitType fruitType;

	public Fruit(String name, int price, FruitType fruitType) {
		super();
		this.name = name;
		this.price = price;
		this.fruitType = fruitType;
	}

	public String dispalyFruit() {
		return "Fruit [name=" + name + ", price=" + price + ", fruitType=" + fruitType + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
