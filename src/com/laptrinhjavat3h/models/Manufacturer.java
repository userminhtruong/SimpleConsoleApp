package com.laptrinhjavat3h.models;

import java.util.Date;

public class Manufacturer {
    private String nameManu;
    private Date yearOfBirth;
    private int code;
    private String bannerName;

    public Manufacturer() {
    }

    public Manufacturer(String nameManu, Date yearOfBirth, int code, String bannerName) {
        this.nameManu = nameManu;
        this.yearOfBirth = yearOfBirth;
        this.code = code;
        this.bannerName = bannerName;
    }

    public String getNameManu() {
        return nameManu;
    }

    public void setNameManu(String nameManu) {
        this.nameManu = nameManu;
    }

    public Date getDateOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

	@Override
	public String toString() {
		return "Manufacturer [nameManu=" + nameManu + ", yearOfBirth=" + (yearOfBirth.getYear() + 1900) + ", code=" + code
				+ ", bannerName=" + bannerName + "]";
	}

}
