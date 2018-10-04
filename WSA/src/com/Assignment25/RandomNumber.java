package com.Assignment25;

import java.util.Random;

/**
 * Problem #25: Write a program to generate 5 Random nos. between 1 to 100, and
 * it should not follow with decimal point..
 */

public class RandomNumber {

	public static void main(String[] args) {

		Random rand = new Random();

		int genrator = 500;

		while (genrator > 0) {
			System.out.println(((int) (Math.random() * genrator + 1)));

			System.out.println();

			System.out.println(rand.nextInt(genrator) + 1);

			genrator--;
		}

	}

}
