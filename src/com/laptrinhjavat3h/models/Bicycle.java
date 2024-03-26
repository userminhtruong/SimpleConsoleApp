package com.laptrinhjavat3h.models;

import java.util.Date;

public class Bicycle extends Device {

	public Bicycle(String name, Manufacturer manufacturer, Date yearOfProduction, float cost) {
		super(name, manufacturer, yearOfProduction, cost);
	}
	
	@Override
	public float calTax() {
		return 0f;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bicycle [name=" + name + ", manufacturer=" + manufacturer + ", yearOfProduction="
				+ (yearOfProduction.getYear() + 1900) + ", cost=" + cost + "]";
	}

}
