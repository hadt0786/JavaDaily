package com.Assignment23;

import java.util.Scanner;

/**
 * Problem #23: Write a program to calculate area of circle, rectangle, square
 * using switch case?
 */

public class Area {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine().toLowerCase();
	
		
		switch (line) {
		case "circle":
			System.out.println("Area of Circle " + "(2*3.14*radius*radius)");
			break;
		case "rectangle":
			System.out.println("Area of Rectangle " + "(length*breadth)");
			break;
		case "square":
			System.out.println("Area of Square " + "(Side*Side)");
			break;
		default:
			System.out.println("Enter a correct value ");
			break;
		}
	}

}
