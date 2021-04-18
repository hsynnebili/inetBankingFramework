package Oops;

public class EngineTest {

	public static void main(String[] args) {

		Engine engine = new Vehicle1();
		engine.speedUp(2);
		engine.changeGear(3);

		System.out.println("===========");

		Vehicle1 vehicle = new Vehicle1();
		vehicle.sound("Good");
		vehicle.changeGear(4);
		vehicle.speedUp(45);

	}

}
