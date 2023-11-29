package com.collection_list_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//8.Create List<Shipment>in which sorting is done according cities 
//and if two order have same cities than according to shipment date(Ascending)
//Shipment class (int shipId, String Cust_name, Address addr, MyDate shipDate)
//Address class (String addr, String City, String State)
//MyDate class  (int dd,mm,yy)

public class Question8 {
	public static void main(String[] args) {
		List<Shipment> list = new ArrayList<>();
		list.add(new Shipment(1, "Ram", new Address("shivaji nagar", "pune", "india"), new MyDate(5, 11, 22)));
		list.add(new Shipment(2, "john", new Address("hadpsar", "pune", "india"), new MyDate(12, 10, 19)));
		list.add(new Shipment(3, "seeta", new Address("chandani chowk", "mumbai", "india"), new MyDate(23, 2, 20)));
		list.add(new Shipment(4, "geeta", new Address("panchavati", "nashik", "india"), new MyDate(6, 10, 23)));
		list.add(new Shipment(5, "shyam", new Address("dadar", "mumbai", "india"), new MyDate(16, 6, 20)));

		for (Shipment s : list) {
			System.out.println(s);
		}
		System.out.println("=====================================");
		Collections.sort(list, new CountryComprator());
		for (Shipment s : list) {
			System.out.println(s);
		}
	}
}

class Shipment {
	private int shipId;
	private String custName;
	private Address addr;
	private MyDate date;

	public Shipment() {
	}

	public Shipment(int shipId, String custName, Address addr, MyDate date) {
		super();
		this.shipId = shipId;
		this.custName = custName;
		this.addr = addr;
		this.date = date;
	}

	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", custName=" + custName + ", addr=" + addr + ", date=" + date + "]";
	}
}

class Address {
	public String address;
	public String city;
	public String state;

	public Address() {
	}

	public Address(String address, String city, String state) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + "]";
	}
}

class MyDate {
	public int dd;
	public int mm;
	public int yy;

	public MyDate() {
	}

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
}
