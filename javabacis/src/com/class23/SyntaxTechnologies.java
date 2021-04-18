package com.class23;

public class SyntaxTechnologies {

	String schoolName = null;
	int batch = 0;
	String year = null;
	String lastDayOfClass = null;

	public SyntaxTechnologies() {

		System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);

	}

	public SyntaxTechnologies(String schoolName, int batch, String year, String lastDayOfClass) {

		schoolName = "Syntax";
		batch = 4;
		year = "2019";
		lastDayOfClass = "07/30/2019";

		System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
	}

}
