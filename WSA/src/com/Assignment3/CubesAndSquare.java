package com.Assignment3;

/**
 * Write Java program to print the squares and cubes for the numbers 1 to 5.
 * Date : 1 OCt
 */

public class CubesAndSquare {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			System.out.println(i + " Square " + Math.pow(i, 2));
			System.out.println();
			System.out.println(i + " cube " + Math.pow(i, 3));
		}

	}

}
