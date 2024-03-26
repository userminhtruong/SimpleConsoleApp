package com.laptrinhjavat3h.models;

import java.util.Date;

public abstract class Device {
	protected final String name;
	protected final Manufacturer manufacturer;
	protected final Date yearOfProduction;
	protected final float cost;

	public Device(String name, Manufacturer manufacturer, Date yearOfBirth, float cost) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.yearOfProduction = yearOfBirth;
		this.cost = cost;
	}
	
	public abstract float calTax();

	@Override
	public String toString() {
		return this.getClass().getName() + " [name=" + name + ", manufacturer=" + manufacturer + ", yearOfProduction=" + yearOfProduction
				+ ", cost=" + cost + "]";
	}

	public String getName() {
		return name;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public Date getYearOfProduction() {
		return yearOfProduction;
	}

	public float getCost() {
		return cost;
	}
	
	
}
