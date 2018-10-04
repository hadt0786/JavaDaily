package com.Assignment;

import java.util.Scanner;

/**
 * Problem #2: Write a program to convert the given temperature in Fahrenheit to Celsius 
 * using the following conversion formula: C = F-32 / 1.8 and display the value in a tabular form. 
 * Date : 1/oct/2018
 * **/


public class TwoCelciusToFah {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		float  f = cin.nextFloat();
		float c = (float) ((f-3.2)/1.8);
		
		System.out.println(c);
		
		

		
	}

}
