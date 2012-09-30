package com.extend.to.delegate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

	Employee emp = new Employee();

	@Test
	public void toStringTest() {
		emp.setName("John Smith");
		assertEquals(emp.toString(), "Emp:Smith");

	}

}
