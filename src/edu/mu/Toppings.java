package edu.mu;

public enum Toppings {
	TOMATO(1.50),
	CHEESE(2.00),
	PINEAPPLE(2.50),
	BLACK_OLIVE(1.25),
	ITALIAN_SAUSAGE(3.50),
	PEPPERONI(3.00),
	BELL_PEPPER(1.00),
	MUSHROOM(1.50),
	CANADIAN_BACON(4.00);
	
	private double price;

	Toppings(double d) {
		this.setPrice(d);
	}
	
	Toppings(){
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double newPrice) {
		try {
			this.price = newPrice;
		}catch(Exception e) {
			System.out.println("Error in setPrice: " + e);
		}
	}

}
