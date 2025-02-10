package com.inheritance;

// parent class or base class 
public class Vehicle {
	
	private int vno ;
	private String name ;
	private int price ;
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [vno=" + vno + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
