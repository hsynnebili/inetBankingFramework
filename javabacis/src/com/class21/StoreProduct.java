package com.class21;

public class StoreProduct {
	String label;
	int price;
	String category;
	boolean hasExpiration = true;
	int stock;

	public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}

	public StoreProduct(String label, int price, int stock) {
		this.label = label;
		this.price = price;
		this.stock = stock;
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}

	public StoreProduct(String label, int price) {
		this.label = label;
		this.price = price;
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}

	public static void main(String[] args) {
		StoreProduct obj = new StoreProduct("Eggs", 3, "Product", true, 10);
		StoreProduct obj1 = new StoreProduct("Paper Towels", 2, "misc", false, 24);
		StoreProduct obj2 = new StoreProduct("Paper Towels", 2,"null",false,0);
        
		
	}
}
