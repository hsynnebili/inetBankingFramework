package Oops;

public interface Engine {

	void changeGear(int a);

	void speedUp(int a);

}

class Vehicle1 implements Engine {

	int speed;
	int gear;
	String sound;

	@Override
	public void changeGear(int a) {

		this.gear = a;
		System.out.println("gear " + gear);

	}

	@Override
	public void speedUp(int a) {
		this.speed = a;
		System.out.println("speed " + speed);

	}

	public void sound(String sound) {
		this.sound = sound;
		System.out.println("Engine sound is " + sound);
	}
}
