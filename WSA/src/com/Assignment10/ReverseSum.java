package com.Assignment10;

import java.util.Scanner;

/**
 * Write a java program that computes the sum of the reciprocals:
 *  1/1 + 1/2 + 1/3 + ... + 1/10 
 *  */


public class ReverseSum {
	
	static double sum = 0;

	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
		int num = cin.nextInt();
		
		while(num>0) {
			sum+=1/num;
			num--;
		}
		
		System.out.println(sum);
	}

}
