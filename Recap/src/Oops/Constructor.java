package Oops;

//Constructor can be overloaded.....

public class Constructor {

	String name;
	int age;
	String country;
	int year;

	Constructor() {
		System.out.println("I am a constructor with no parameter");
	}

	Constructor(String name) {
		this.name = name;
		System.out.println("My name is: " + name);
	}

	Constructor(int age) {
		this.age = age;
		System.out.println("and I am " + age + " old.");
	}

	Constructor(String country, int year) {
		this.country = country;
		this.year = year;
		System.out.println("I am from " + country + " and have lived for " + year + " in this country");

	}

	public void display() {
		this.age = age;
		this.name = name;
		this.year = year;
		this.country = country;
		System.out.println("My name is " + name + " and I am " + age + " years old.I am from " + country
				+ " and have lived in this country for " + year + " year(s).");
	}
	
	
}

