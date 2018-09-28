package com.Assignment27;

/**
 * Problem #26: Write a program to find sum of all integers greater than 100 and
 * less than 200 that are divisible by 7.
 */

public class SumBetween {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
