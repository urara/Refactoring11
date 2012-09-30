package com.extend.to.delegate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

	Person person = new Person();

	@Test
	public void getLastNametest() {

		person.setName("John Smith");
		assertEquals(person.getLastName(), "Smith");
	}

}
