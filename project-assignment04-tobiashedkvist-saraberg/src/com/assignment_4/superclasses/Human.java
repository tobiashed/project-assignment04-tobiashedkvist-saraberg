package com.assignment_4.superclasses;
/**
 * Human class
 * 
 * @author Tobias Hedkvist & Sara Berg
 * 
 * @version 1.0
 * 
 * Human: has two attributes, String name and integer age.
 *
 */
public class Human {
	private String name = "";
	private int age = 0;
	
	/**
	 * Constructor method
	 * 	
	 * @param name	requires a String with name
	 * @param age	requires a integer value with age
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * getter for name
	 * @return	returns a String with name
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter for name
	 * @param name	requires a String with name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter for age
	 * @return	returns an integer value with age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * setter for age
	 * @param age	requires an integer value with age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
