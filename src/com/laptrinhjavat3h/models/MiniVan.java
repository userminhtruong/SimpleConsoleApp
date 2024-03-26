package com.laptrinhjavat3h.models;

import java.util.Date;

public class MiniVan extends Motor {
	protected final float storageLoad;
	protected final float storageWidth;

	public MiniVan(String name, Manufacturer manufacturer, Date yearOfProduction, float cost, float engineDisplacement,
			float storageLoad, float storageWidth) {
		super(name, manufacturer, yearOfProduction, cost, engineDisplacement);
		// TODO Auto-generated constructor stub
		this.storageLoad = storageLoad;
		this.storageWidth = storageWidth;
	}

	@Override
	public String toString() {
		return "MiniVan [storageLoad=" + storageLoad + ", storageWidth=" + storageWidth + ", engineDisplacement="
				+ engineDisplacement + ", name=" + name + ", manufacturer=" + manufacturer + ", yearOfProduction="
				+ (yearOfProduction.getYear() + 1900) + ", cost=" + cost + "]";
	}

	@Override
	public float calTax() {
		// TODO Auto-generated method stub
		return this.cost * 0.072f;
	}

	public float getStorageLoad() {
		return storageLoad;
	}

	public float getStorageWidth() {
		return storageWidth;
	}

}
