package com.hier;

public class BillingScheme {
	public static final int SPRING = 1;
	public static final int SUMMER = 2;
	public static final int FALL = 3;
	public static final int WINTER = 4;

	public static final double Tax = 1.05;

	public double createBill(int season, Customer customer) {
		int payment = 0;
		double seasonFee = getSeasonFee(season);

		double charFee = getCharFee(customer);

		return 2000 * seasonFee * charFee;

	}

	private double getSeasonFee(int season) {
		double seasonFee = 1.0;

		if (season == SUMMER) {
			seasonFee = 1.2;
		} else if (season == WINTER) {
			seasonFee = 0.8;
		}
		return seasonFee;
	}

	private double getCharFee(Customer customer) {
		double charFee = 1.0;
		if (customer.getType() == customer.BELONG_COMPANY) {
			charFee = 0.8;
		} else if (customer.getType() == customer.DISABILITY) {
			charFee = 0.5;
		}
		return charFee;
	}
}
