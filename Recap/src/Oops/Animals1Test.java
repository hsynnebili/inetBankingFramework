package Oops;

public class Animals1Test {

	public static void main(String[] args) {

		Animals1 animals = new Terrestrial("abc");
		animals.habitat();
		animals.respiration();

		System.out.println("===========");

		Animals1 ani = new Aquatic("Silly");
		ani.BasicInfo("cat");

		System.out.println("============");

		Aquatic aq = new Aquatic("Valley");

		aq.habitat();
		aq.respiration();
		aq.Water("clean");

	}

}
