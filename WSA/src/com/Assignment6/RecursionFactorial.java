package com.Assignment6;

import java.util.Scanner;

/**
 *By using recursion calculate factorial of given number? 

*Ex: Factorial of 5=120
 * */

public class RecursionFactorial {

	public static int factorial(int n) {
		if(n == 0) return 0;
		if(n==1) return 1;
		
		return (factorial(n)*factorial(n-1));
	}
	
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		System.out.println(factorial(n));
		
	}

}
