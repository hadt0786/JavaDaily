package com.Assignment13;

import java.util.Scanner;

/**
 * Problem #15: Write a program to find maximum and minimum of two numbers.
 * 
 */

public class MaxAndMin {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int a = cin.nextInt();
		int b = cin.nextInt();

		System.out.println("Minimum value" + Math.min(a, b));
		System.out.println("Maximum value" + Math.max(a, b));

	}

}
