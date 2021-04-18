package Oops;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle veh = new Car();
		veh.startEngine();
		veh.stopEngine();

		System.out.println("=======");

		Movable mov = new Car();
		mov.move();

		System.out.println("============");

		Car car = new Car();
		car.display(5, "Sienna", "Toyota");
		car.move();
		car.startEngine();
		car.stopEngine();

	}

}
