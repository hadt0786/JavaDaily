package com.Assignment13;

import java.util.Scanner;

/**
 * • Write a program in the sequence Fib.java 1 1 2 3 5 8 13 21 ……………… and
 * called Fibonacci numbers. Write a program using a do…while loop to calculate
 * and print the first m Fibonacci numbers.
 * 
 */

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int m = cin.nextInt();

		while (m > 0) {

			System.out.println(calculate(m));

			m--;
		}
		cin.close();
	}

	private static int calculate(int m) {

		if (m == 1)
			return 1;

		return calculate(m) + calculate(m - 1);

	}

}
