package com.zenika.formation;

/** Basic model */
public class Person {

	private String name;

	private String firstName;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return greetings for person
	 */
	public String getGreetings() {
		return String.format("Hello %s %s !", this.firstName, this.name);
	}

}
