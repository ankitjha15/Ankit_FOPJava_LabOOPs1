package com.greatlearning.model;

public class Employee {

	private String firstName, lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
