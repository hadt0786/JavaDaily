package com.Assignment5;

import java.util.Scanner;

/**
 *  Write a java program for finding the sum, difference, product, quotient, minimum and maximum of any two integers.*/

public class Calculator {

	
	
	public static void main(String[] args) {

		Scanner cin =new Scanner (System.in);
		
		int a = cin.nextInt(), b = cin.nextInt();
		
		System.out.println("Sum "+(a+b));
		System.out.println("Subract "+Math.abs(a-b));
		System.out.println("Multiply "+(a*b));
		System.out.println("Divide  "+(a/b));
		
	}

}
