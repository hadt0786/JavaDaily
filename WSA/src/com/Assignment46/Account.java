package com.Assignment46;

/**
 * 
 * • Problem #46: A bank maintains two kinds of accounts - Savings Account and
 * Current Account. The savings account provides compound interest, deposit and
 * withdrawal facilities. The current account only provides deposit and
 * withdrawal facilities. Current account holders should also maintain a minimum
 * balance. If balance falls below this level, a service charge is imposed.
 * Create a class Account that stores customer name, account number, and type of
 * account. 
 * From this derive the classes Curr-acct and Sav-acct. 
 * Include the necessary methods in order to achieve the following tasks. 
 * ◦ Accept deposit from a customer and update the balance. 
 * ◦ Display the balance. 
 * ◦ Compute interest and add to balance. 
 * ◦ Permit withdrawal and update the balance (Check for the minimum balance, impose 
 * ◦ penalty if necessary).
 * 
 * 
 */

enum AccountType {
	SAVING, CURRENT
}

public class Account {
	private String name ;
	private double accountNumber;
	private AccountType accType;
	
	public Account(String name, double accountNumber, AccountType accType) {
		
		this.name = name;
		this.accountNumber = accountNumber;
		this.accType = accType;
	}
	
	
}
