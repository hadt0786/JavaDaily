package com.Assignment7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		PrivateDemo object = new PrivateDemo();
		
		Scanner cin = new Scanner(System.in);
		
		int a = cin.nextInt();
		object.setVaribale(a);
		System.out.println("Printing in main class "+object.getVaribale());
		
	}

}
