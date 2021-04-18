package Oops;

public class AnimalsTest {

	public static void main(String[] args) {

		Animals animals = new Cat1("Silly");
		animals.animalSound();
		animals.bear();
		animals.display();

		Cat1 cat = new Cat1("Silly");

		cat.display("Silly", 3);

		cat.explan();
	}

}
