package com.Assignment24;

import java.util.Scanner;

/**
 * Problem #24: Write a program to check entered characters is vowel or not
 * using switch case?
 */

enum Vowels {
	a, e, i, o, u;
	
	
}

public class CheckVowel {

	Vowels v;
	
	 public void EnumTest(Vowels c) {
	        this.v = c;
	    }

	public static void main(String[] args) {

		//Scanner cin = new Scanner(System.in);
		// String str = cin.nextLine();
		String str = "Checking";
		
		char[] ch = str.toLowerCase().toCharArray();

		
		
		int count = str.length()-1;

//		while (count > 0) {
//			if (ch.equals(v[count]))
//				System.out.println("true"+count);
//			else
//				System.out.println("false"+count);
//			count--;
//		}
	}

}
