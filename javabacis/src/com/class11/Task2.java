package com.class11;

public class Task2 {
	public static void main(String[] args) {
		String[] country = { "Azerbaijan", "England", "Albania", "Russia" };
        for (int i = 0; i <= country.length - 1; i++) {

            if (country[i].equals("Azerbaijan")) {
                System.out.println("Baku");
            } else if (country[i].equals("England")) {
                System.out.println("London");
            } else if (country[i].equals("Albania")) {
                System.out.println("Tirana");
            } else if (country[i].equals("Russia")) {
                System.out.println("Moscow");
            }

        }

        String[] countryList = { "Turkey", "USA", "Ukraine" };
        for (String countryy : countryList) {
            switch (countryy) {
            case "Turkey":
                System.out.println("Ankara");
                break;
            case "USA":
                System.out.println("Washington DC");
                break;
            case "Ukraine":
                System.out.println("Kiev");
                break;
            }
        }
        
    }
}
