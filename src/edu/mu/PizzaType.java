package edu.mu;

public enum PizzaType {
	HAWAIIAN(3.00),
	MARGHERITA(2.50),
	SUPREME(3.50),
	VEGETARIAN(1.50);
	private double toppingPrice;
	
	PizzaType(double toppingPrice){
		this.setToppingPrice(toppingPrice);
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
}
