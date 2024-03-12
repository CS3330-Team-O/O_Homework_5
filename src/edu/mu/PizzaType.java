package edu.mu;

public enum PizzaType {
	//enums for PizzaType
	HAWAIIAN(3.00),
	MARGHERITA(2.50),
	SUPREME(3.50),
	VEGETARIAN(1.50);
	private double toppingPrice;
	
	//setsToppingPrice for each pizza enum
	PizzaType(double toppingPrice){
		this.setToppingPrice(toppingPrice);
	}

	//getter for toppingPrice
	public double getToppingPrice() {
		return toppingPrice;
	}

	//setter for toppingPrice
	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
}
