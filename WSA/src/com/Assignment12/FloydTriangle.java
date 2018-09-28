package com.Assignment12;

import java.util.Scanner;

/**
 *     • Shown below is a Floyd’s triangle 
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 
    • Write a program to print this triangle. 
    •  Modify the program to produce the following form of Floyd’s triangle.
		1 
		01 
		101 
		0101 
		10101 
 * */


public class FloydTriangle {

	public static void main(String[] args) {

		Scanner cin  = new Scanner(System.in);
		
		int rows = cin.nextInt();
		
		while(rows>0) {
			while(rows>0) {
			System.out.println(rows);
			
			
			}
			rows--;
			System.out.println();
			
		}
			}

}
