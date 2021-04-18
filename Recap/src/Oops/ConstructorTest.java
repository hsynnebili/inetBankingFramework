package Oops;

public class ConstructorTest {

	public static void main(String[] args) {

		Constructor con = new Constructor();
		Constructor con1 = new Constructor("Huseyin");
		Constructor con2 = new Constructor(38);
		Constructor con3 = new Constructor("Turkey", 1);

		Constructor dis = new Constructor();
		dis.age = 38;
		dis.country = "Turkey";
		dis.name = "Huseyin";
		dis.year = 1;

		dis.display();

	}
}
