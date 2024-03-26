package com.laptrinhjavat3h.models;

import java.util.Date;

public class Motor extends Bicycle {
	protected final float engineDisplacement;

	public Motor(String name, Manufacturer manufacturer, Date yearOfProduction, float cost, float engineDisplacement) {
		super(name, manufacturer, yearOfProduction, cost);
		this.engineDisplacement = engineDisplacement;
	}

	@Override
	public String toString() {
		return "Motor [engineDisplacement=" + engineDisplacement + ", name=" + name + ", manufacturer=" + manufacturer
				+ ", yearOfProduction=" + (yearOfProduction.getYear() + 1900) + ", cost=" + cost + "]";
	}

	@Override
	public float calTax() {
		// TODO Auto-generated method stub
		return this.cost * 0.05f;
	}

	public float getEngineDisplacement() {
		return engineDisplacement;
	}
	
	

}
