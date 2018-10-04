package com.Assignment22;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		Integer num = cin.nextInt();

		while (num > 0) {
			num = num % 10;
			System.out.println(num);
			num=num/10;
			
		}

	}

}
