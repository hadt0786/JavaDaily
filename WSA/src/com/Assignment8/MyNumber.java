package com.Assignment8;

import java.util.Scanner;

/**
 *     • Write a java program 'MyNumber.java" 
 *     that performs following operations on a variable  'num' of type double: 
        ◦
         Finds the round value of 'num' and stores the result in a variable 
         numRound of type double. 
         
         Finds the ceil value of 'num' and stores the result in a 
         variable numCeil of type double. 
         
         Finds the floor value of 'num' and stores the result in a 
         variable numFloor of  type double 
         
         Cast 'num' to type int and stores the result in a variable numInteger of type int. 
         Display output of numRound, numCeil, numFloor and numInteger on screen. 
        
         Note: 
         Test your program with following value of num 
         num=56.764 
         num=36.432 
         Use Math.round, Math.ceil, Math.floor methods of class Math for 1,2 and 3.  
 * 
 * */


public class MyNumber {
	
	static double num;

	public static void main(String[] args) {
		
		Scanner cin  = new Scanner(System.in);
		num = cin.nextDouble();
		
		System.out.println("Round Number "+Math.round(num));
		System.out.println("Floor value "+Math.floor(num));
		
		System.out.println("Casting the double to int "+(int)num);
		
	}

}
