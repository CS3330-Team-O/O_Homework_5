package edu.mu;

import java.util.ArrayList;

public abstract class AbstractPizza {
	protected ArrayList<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected CookingStyleType cookingStrategy;
	protected double cookingPrice;
	
	public ArrayList<Toppings> getToppingList() {
		return toppingList;
	}
	public void setToppingList(ArrayList<Toppings> toppingList) {
		this.toppingList = toppingList;
	}
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}
	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}
	public CookingStyleType getCookingStrategy() {
		return cookingStrategy;
	}
	public void setCookingStrategy(CookingStyleType cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}
	public double getCookingPrice() {
		return cookingPrice;
	}
	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	public static CookingStyleType convertStringToCookingStyleType(String cookingStyle) {
		switch(cookingStyle) {
			case "MICROWAVE":
				return CookingStyleType.MICROWAVE;
			case "BRICK_OVEN":
				return CookingStyleType.BRICK_OVEN;
			default:
				return CookingStyleType.CONVENTIONAL_OVEN;
		}
	}
	
	protected abstract double addToppingsToPrice(double priceWithoutToppings);
	public abstract double updatePizzaPrice();
	
	
}
