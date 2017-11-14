package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.*;
/**
 * Bank customer class
 * 
 * @author Tobias Hedkvist & Sara Berg
 * 
 * @version 1.0
 * 
 * BankCustomer class: extends Human class, has one attribute,
 * a BankAccount ArrayList called customer accounts.
 *
 */
public class BankCustomer extends Human {
	
	public ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	
	/**
	 * BankCustomer constructor method
	 *
	 * @param name	requires a String with customer name
	 * @param age	requires an integer value with customer age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}
	/**
	 * Getter for customer accounts
	 * @return	customerAccounts	returns an ArrayList with account information
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}
	/**
	 * Setter for customer accounts	 
	 * @param customerAccounts	requires an ArrayList with account information
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	/**
	 * addAccount method
	 * adds an account to the ArrayList customerAccounts
	 * @param bankAccount	requires an object of the class BankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		//check for duplicates 
		if (customerAccounts.contains(bankAccount)) {
			System.out.println(bankAccount + " already exists!");
		} else {
			customerAccounts.add(bankAccount);
		}
		
	}
	/**
	 * depositToAccount method
	 * adds a double value to the balance of the account
	 * @param accountNumber	requires a String with account number
	 * @param amount	requires a double value with amount to be deposited
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
		
	}
	/**
	 * withdrawFromAccount method
	 * subtracts a double value from the balance of the account
	 * @param accountNumber	requires a String with account number
	 * @param amount	requires a double value with amount to be withdrawn
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);;
			}
		}
		
	}
	/**
	 * toString method
	 * @return returns a String with customer name and age, plus all bank account details,
	 * (account number, type & balance)
	 */
	public String toString() {
		 String result = "";
		 // iterate through customerAccounts in order to print all positions in the arrayList
	      for(int i = 0; i < customerAccounts.size(); i++){
	    	  result += customerAccounts.get(i);
	          // adding a line break
	          result+= "\n";
	      }
		return "Bank Customer: " + getName() + ", Age: " + getAge() + "\n" + result;
		
	}

}
