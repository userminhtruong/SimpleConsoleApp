package com.laptrinhjavat3h.models;

import java.util.Date;

public class Car extends Motor {

	public Car(String name, Manufacturer manufacturer, Date yearOfProduction, float cost, float engineDisplacement,
			float trunkCapacity) {
		super(name, manufacturer, yearOfProduction, cost, engineDisplacement);
		this.trunkCapacity = trunkCapacity;
		// TODO Auto-generated constructor stub
	}

	protected final float trunkCapacity;

	@Override
	public String toString() {
		return "Car [trunkCapacity=" + trunkCapacity + ", engineDisplacement=" + engineDisplacement + ", name=" + name
				+ ", manufacturer=" + manufacturer + ", yearOfProduction=" + (yearOfProduction.getYear() + 1900)
				+ ", cost=" + cost + "]";
	}

	@Override
	public float calTax() {
		// TODO Auto-generated method stub
		return this.cost * 0.12f;
	}

	public float getTrunkCapacity() {
		return trunkCapacity;
	}

}
