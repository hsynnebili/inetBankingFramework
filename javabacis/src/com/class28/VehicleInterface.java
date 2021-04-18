package com.class28;

public interface VehicleInterface {

	// all are the abstract methods.
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);

}

 interface VehicleInterface1 {

	// all are the abstract methods.
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);

}

 
class Carr implements VehicleInterface,VehicleInterface1 {

	int speed;
	int gear;

	// to change gear
	@Override
	public void changeGear(int a) {

		gear = a;

	}

	// to increase speed
	@Override
	public void speedUp(int a) {

		speed = speed + a;
	}

	// to decrease speed
	@Override
	public void applyBrakes(int a) {
		speed = speed - a;
	}

	public void display() {
		System.out.println("Speed= " + speed + " gear= " + gear);
	}

}

class Bus implements VehicleInterface {
	int speed;
	int gear;

	// to change gear
	@Override
	public void changeGear(int a) {
		gear = a;

	}

	// to increase to speed
	@Override
	public void speedUp(int a) {
		speed = speed + a;

	}

	// to decrease to speed
	@Override
	public void applyBrakes(int a) {
		speed = speed - a;

	}

	public void display() {
		System.out.println("Speed= " + speed + " gear " + gear);
	}

}
