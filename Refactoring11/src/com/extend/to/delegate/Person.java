package com.extend.to.delegate;

public class Person {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return name.substring(name.indexOf(' ') + 1);
	}
}
