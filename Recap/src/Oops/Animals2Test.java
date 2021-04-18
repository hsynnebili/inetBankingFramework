package Oops;

public class Animals2Test {
	public static void main(String[] args) {

		Lavanten lav = new Horse("Lavanten");
		lav.habitat();
		lav.respiration();
		lav.nation();

		System.out.println("==========");

		Rocktair roc = new Horse("Rocktair");
		roc.habitat();
		roc.respiration();
		roc.nation();

		System.out.println("==========");

		Horse horse = new Horse();
//		horse.habitat();
//		horse.respiration();
		//horse.display();

	}

}
