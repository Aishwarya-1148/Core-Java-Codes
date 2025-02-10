package com.inheritance;

public class SportsCar extends Car{
	
	private int speed ;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "SportsCar [speed=" + speed + "]";
	}
	
}
