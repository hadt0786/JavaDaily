package com.Assignment28;

import java.util.Scanner;

/**
 * Problem #28 : Write a program to swap the value of two variable without using
 * third variable. Author : AKASH DATE : Sep 27, 2018
 * 
 */

public class Swap {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int a, b;

		a = cin.nextInt();
		b = cin.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + " " + b);

	}

}
