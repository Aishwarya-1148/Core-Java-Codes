package com.inheritance;

// child class or derieved class 
public class Car extends Vehicle
{
	private String alarm ;
	private String navigation;
	public String getAlarm() {
		return alarm;
	}
	public void setAlarm(String alarm) {
		this.alarm = alarm;
	}
	public String getNavigation() {
		return navigation;
	}
	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}
	@Override
	public String toString() {
		return "Car [alarm=" + alarm + ", navigation=" + navigation + "]";
	}
	
	
}
