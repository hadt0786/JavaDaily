package com.Assignment27;

import java.util.Scanner;

/**
 * Problem #27: Write a program to swap the values 24. Author : AKASH Date : Sep
 * 27 2018
 * Not Completed
 */

public class SwapDigit {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int value = cin.nextInt();

		int[] a = extractingDigits(value);
		System.out.println(a[1] + " " + a[1]);
		System.out.println(value / 100);
		cin.close();

	}

	private static int[] extractingDigits(int value) {

		int a[] = new int[2];
		a[0] = (int) value / 10;
		a[1] = (int) value % 10;

		return a;

	}

}
