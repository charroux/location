package com.example.Location;

public class Car {
	
	private String brand;
	private String plateNumber;
	private int price;
	private boolean rented;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String plateNumber, int price) {
		super();
		this.brand = brand;
		this.plateNumber = plateNumber;
		this.price = price;
		this.rented = false;
	}
	
	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
