package com.hier;

public class Customer {

	public static final int BELONG_COMPANY = 1;
	public static final int RESIDENTIAL = 2;
	public static final int DISABILITY = 3;

	int type;

	public Customer(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
