package Oops;

public abstract class Animals1 {

	String animalName;

	Animals1(String name) { // declare non-abstract methods
		this.animalName = name;

		System.out.println("Constructor of superclass");

	}

	public void BasicInfo(String details) {
		System.out.println(this.animalName + " is a " + details);
	}

	// abstract methods which will be implemented by its subclasses

	abstract public void habitat();

	abstract public void respiration();

}

class Terrestrial extends Animals1 {

	// constructor
	Terrestrial(String name) {
		super(name);
		System.out.println("Constructor of subclas1");
	}

	@Override
	public void habitat() {
		System.out.println("habitat of Terrestrial");
	}

	@Override
	public void respiration() {
		System.out.println("respirationf Terrestrial");

	}

}

class Aquatic extends Animals1 {

	String situation;

	Aquatic(String name) {

		super(name);

		System.out.println("Constructor of subclas2");

	}

	@Override
	public void habitat() {
		System.out.println("habitat of Aquatic ");

	}

	@Override
	public void respiration() {
		System.out.println("respiration of Aquatic");

	}

	public void Water(String situation) {
		this.situation = situation;
		System.out.println("Water situation is " + situation);

	}
}
