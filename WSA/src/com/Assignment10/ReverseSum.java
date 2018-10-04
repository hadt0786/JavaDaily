package com.Assignment10;

import java.util.Scanner;

/**
 * Problem #10: Write a java program that computes the sum of the reciprocals:
 * 1/1 + 1/2 + 1/3 + ... + 1/10
 */

public class ReverseSum {

	static float sum = 0.0f;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		for (float i = 1; i <= 10; i++) {
			System.out.println(1/i);
			sum += 1 / i;

		}
		System.out.println(sum);
	}

}
