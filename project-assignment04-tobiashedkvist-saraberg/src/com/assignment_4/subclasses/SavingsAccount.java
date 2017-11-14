package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/**
 * SavingsAccount class
 * 
 * @author Tobias Hedkvist & Sara Berg
 * 
 * @version 1.0
 *
 */
public class SavingsAccount extends BankAccount {
	/**
	 * Constructor Method
	 * 
	 * Constructor generates an account number with a random UUID of 6 characters,
	 * it sets balance to 0 and also sets account type to savings account.
	 * 
	 */
	public SavingsAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Savings Account");
	}
}
