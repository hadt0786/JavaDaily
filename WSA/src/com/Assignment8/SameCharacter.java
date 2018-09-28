package com.Assignment8;

import java.util.Scanner;

/**
 *• Write a program to count the same character in the String?

			Ex:EMERTXE
			E=3
			M=1
			R=1
			T=1
			X=1
 * 
 * */


public class SameCharacter {



	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		String str= new String();

		str = cin.next();
		System.out.println(str);
		int count[] = new int[str.length()];
		int index = 0;
		int length = str.length();
		while(length>0) {
			System.out.println("Inside");

			char a = str.charAt(index);
			System.out.println(a);
			index++;
			for(int i =index ; i<str.length();i++) {
				while(a==str.charAt(i)) count[i]++;
			}

			length--;

		}
		for(int i =0 ; i<str.length();i++) {
			System.out.println(str.charAt(i)+ " "+ count[i]);
		}

	}

}
