package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;
/**
 * BankAccount class
 * 
 * @author Tobias Hedkvist & Sara Berg
 * 
 * @version 1.0
 *
 * Class BankAccount: Implements the interface BankOperations and has three
 * attributes: String accountNumber, String accountType and double balance.
 */

public class BankAccount implements BankOperations {

	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;
	
	/**
	 * Constructor Method
	 * 
	 * Constructor generates an account number with a random UUID of 6 characters,
	 * it sets balance to 0 and also sets account type to bank account.
	 * 
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6); 
		this.accountType = "Bank Account";
		this.balance = 0.0;
	}
	/**
	 * Getter for account number
	 * @return	accountNumber	returns a String with account number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * Setter for account number	 
	 * @param accountNumber	requires a String with account number
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * Getter for account type
	 * @return accountType	returns a String with account type
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * Setter for account type
	 * @param accountType	requires a String with account type
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * Getter for balance
	 * @return balance	returns a double value with current account balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Setter for balance
	 * @param balance	requires a double value with current account balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * withdrawMoney method: implementation of method from the interface BankOperations
	 * this method enables withdrawal from bank account, 
	 * it also considers withdrawals by 0 or negative amount
	 * @param	amount	requires a double value with amount to be withdrawn
	 */
	public void withdrawMoney(double amount) {
		if (amount > 0) {
			setBalance(getBalance() - amount) ;
		} else if (amount == 0) {
			System.out.println("You can not withdraw zero!");
		} else {
			System.out.println("You can not withdraw a negative amount!");
		}
		
	}

	/**
	 * depositMoney method: implementation of method from the interface BankOperations
	 * this method enables depositions to bank account, 
	 * it also considers depositions by 0 or negative amount
	 * @param	amount	requires a double value with amount to be deposited
	 */
	public void depositMoney(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount) ;
		} else if (amount == 0) {
			System.out.println("You can not deposit zero!");
		} else {
			System.out.println("You can not deposit a negative amount!");
		}
	}

	/**
	 * toString method
	 * @return returns a String with all attributes, account number, account type and balance
	 */
	public String toString() {
		return "BankAccount [Account Number = " + accountNumber + ", Account Type = " + accountType + ", Balance = " + balance
				+ "]";
	}

}
