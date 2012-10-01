package com.hier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BillingSchemeTest {

	BillingScheme bs = new BillingScheme();

	@Test
	public void createBillTest() {
		Customer cust1 = new Customer(Customer.BELONG_COMPANY);
		// System.out.println(i);
		assertEquals((int) bs.createBill(bs.SUMMER, cust1), 1920);

	}
}
