package com.assignment_4.main;

import com.assignment_4.subclasses.*;
import com.assignment_4.superclasses.BankAccount;

/**
 * Main class
 * 
 * @author Tobias Hedkvist & Sara Berg
 * 
 * @version 1.0
 *
 */
public class Main {
	/**
	 * Main method
	 * this method creates an object of the class BankCustomer 
	 * and generates, manipulates and prints account information 
	 * @param args
	 */
	public static void main(String[] args) {
		String account = "";
		
		//Create new object bank customer
		BankCustomer bc = new BankCustomer("Tobias", 37);
		
		//Create 3 different account types & print
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingsAccount());
		System.out.println(bc.toString());
		
		//Manipulate first account & print
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to first account...");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		//Manipulate second account & print
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		System.out.println("Withdrawing 200.0 from second account...");
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		//Manipulate third account & print
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		System.out.println("Depositing 200.0 to third account...");
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());
	}

}
