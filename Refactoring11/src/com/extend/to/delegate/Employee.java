package com.extend.to.delegate;

public class Employee {
	Person person = new Person();

	public String getName() {
		return person.getName();
	}

	public void setName(String name) {
		person.setName(name);
	}

	public String toString() {
		return "Emp:" + person.getLastName();
	}
}
