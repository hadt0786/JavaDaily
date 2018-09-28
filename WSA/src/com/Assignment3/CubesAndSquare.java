package com.Assignment3;

/**
 * Write Java program to print the squares and cubes for the numbers 1 to 5. */


public class CubesAndSquare {

	public static void main(String[] args) {

		for(int i=1 ; i<=5;i++) {
			System.out.println(" Square "+Math.pow(i, 2));
			System.out.println();
			System.out.println(" cube "+Math.pow(i, 3));
		}
		
		
	}

}
