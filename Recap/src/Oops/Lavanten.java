package Oops;

public interface Lavanten {

	public void nation();

	public void habitat();

	public void respiration();

}

interface Rocktair {

	// abstract methods

	public void nation();

	public void habitat();

	public void respiration();

}

class Horse implements Lavanten, Rocktair {

	Horse(){
		
	}
	Horse(String name) {
		System.out.println(name + " is a specific name for him.");
	}

	@Override
	public void habitat() {
		System.out.println("Habitat of horse.");

	}

	@Override
	public void respiration() {

		System.out.println("Respiration of horse.");
	}

	@Override
	public void nation() {
		System.out.println("Nation of  horse");
	}

	public void display() {

		System.out.println("We use horses to carry load.");
	}

}
