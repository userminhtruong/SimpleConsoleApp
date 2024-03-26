package com.laptrinhjavat3h.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import com.laptrinhjavat3h.models.Bicycle;
import com.laptrinhjavat3h.models.Car;
import com.laptrinhjavat3h.models.Manufacturer;
import com.laptrinhjavat3h.models.MiniVan;
import com.laptrinhjavat3h.models.Motor;

public class Util {
	public static void calculateBillTax(Scanner scanner) {
		String[] arrayOfDevices = { "bicycle", "motor", "car", "minivan" };
		System.out.print("\n Choose one of these option " + Arrays.toString(arrayOfDevices) + ": ");
		String choice = scanner.next();
		try {
			switch (choice) {
			case "bicycle":
				Bicycle bicycle = inputDataBicycle(scanner);
				System.out.println("inputed data: " + bicycle.toString());
				System.out.println("Tax calculated: " + bicycle.calTax());
				break;
			case "motor":
				Motor motor = inputDataMotor(scanner);
				System.out.println("inputed data: " + motor.toString());
				System.out.println("Tax calculated: " + motor.calTax());
				break;
			case "car":
				System.out.print("input trunk capacity: ");
				float trunkCapacity = Float.parseFloat(scanner.next());
				motor = inputDataMotor(scanner);
				Car car = new Car(motor.getName(), motor.getManufacturer(), motor.getYearOfProduction(),
						motor.getCost(), motor.getEngineDisplacement(), trunkCapacity);
				System.out.println("inputed data: " + car.toString());
				System.out.println("Tax calculated: " + car.calTax());
				break;
			case "minivan":
				System.out.print("input storage load: ");
				float storageLoad = Float.parseFloat(scanner.next());
				System.out.print("input storage width: ");
				float storageWidth = Float.parseFloat(scanner.next());
				motor = inputDataMotor(scanner);
				MiniVan miniVan = new MiniVan(motor.getName(), motor.getManufacturer(), motor.getYearOfProduction(),
						motor.getCost(), motor.getEngineDisplacement(), storageLoad, storageWidth);
				System.out.println("inputed data: " + miniVan.toString());
				System.out.println("Tax calculated: " + miniVan.calTax());
				break;
			default:
				System.out.println("Unknown option!");
				break;
			}
		} catch (NumberFormatException e) {
			System.err.println("Wrong number input");
		} catch (ParseException e) {
			System.err.println("Wrong year format");
		} catch (Exception e) {
			System.err.println("Program detected error!");
		}
	}

	public static Bicycle inputDataBicycle(Scanner scanner) throws ParseException, NumberFormatException {
		Manufacturer manu = null;
		String name = null;
		Date yearOfBirth = null;
		float cost = 0f;
		manu = getManu(scanner);
		System.out.print("Input device's name: ");
		name = scanner.next();
		System.out.print("input device's year of production: ");
		SimpleDateFormat formater = new SimpleDateFormat("yyyy");
		yearOfBirth = formater.parse(scanner.next());
		System.out.print("input device's cost: ");
		cost = Float.parseFloat(scanner.next());
		return new Bicycle(name, manu, yearOfBirth, cost);
	}

	public static Motor inputDataMotor(Scanner scanner) throws ParseException, NumberFormatException {
		System.out.print("input device's engine displacement: ");
		float engineDisplacement = Float.parseFloat(scanner.next());
		Bicycle bicycle = inputDataBicycle(scanner);
		return new Motor(bicycle.getName(), bicycle.getManufacturer(), bicycle.getYearOfProduction(), bicycle.getCost(),
				engineDisplacement);
	}

	public static Manufacturer getManu(Scanner scanner) throws ParseException, NumberFormatException {
		Manufacturer manufacturer = new Manufacturer();
		System.out.print("type in device's manufacturer: \nmanufacturer name: ");
		manufacturer.setNameManu(scanner.next());
		System.out.print("manufacturer year of birth: ");
		SimpleDateFormat formater = new SimpleDateFormat("yyyy");
		manufacturer.setYearOfBirth(formater.parse(scanner.next()));
		System.out.print("manufacturer code: ");
		manufacturer.setCode(Integer.parseInt(scanner.next()));
		System.out.print("manufacturer banner name: ");
		manufacturer.setBannerName(scanner.next());
		return manufacturer;
	}
}
