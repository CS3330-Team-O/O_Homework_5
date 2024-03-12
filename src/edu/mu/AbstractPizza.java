package edu.mu;

import java.util.ArrayList;

public abstract class AbstractPizza {
	protected ArrayList<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected CookingStyleType cookingStrategy = null;
	protected double cookingPrice;

	public ArrayList<Toppings> getToppingList() {
		return new ArrayList<Toppings> (toppingList);
	}
	public void setToppingList(ArrayList<Toppings> toppingList) {
		try {
			this.toppingList = toppingList;
		}catch (Exception e) {
			System.out.println("Error in setToppingList: " + e);
		}
	}
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		try {
			this.priceWithoutToppings = priceWithoutToppings;
		} catch (Exception e) {
			System.out.println("Error in setPriceWithoutToppings: " + e);
		}
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		try {
			this.totalPrice = totalPrice;
		} catch (Exception e) {
			System.out.println("Error in setTotalPrice: " + e);
		}
	}
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	public void setPizzaOrderID(int pizzaOrderID) {
		try {
			this.pizzaOrderID = pizzaOrderID;
		} catch (Exception e) {
			System.out.println("Error in setPizzaOrderID: " + e);
		}
	}
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}
	public static void setOrderIDCounter(int orderIDCounter) {
		try {
			AbstractPizza.orderIDCounter = orderIDCounter;
		}catch(Exception e) {
			System.out.println("Error in setOrderIDCounter: " + e);
		}
	}
	public CookingStyleType getCookingStrategy() {
		return cookingStrategy;
	}
	public void setCookingStrategy(CookingStyleType cookingStrategy) {
		try {
			this.cookingStrategy = cookingStrategy;
		}catch(Exception e) {
			System.out.println("Error in setCookingStrategy: " + e);
		}
	}
	public double getCookingPrice() {
		return cookingPrice;
	}
	public void setCookingPrice(double cookingPrice) {
		try {
			this.cookingPrice = cookingPrice;
		}catch (Exception e) {
			System.out.println("Error in setCookingPrice: " + e);
		}
	}

	//Convert a string of the cooking style to the enum
	public static CookingStyleType convertStringToCookingStyleType(String cookingStyle) {
		switch(cookingStyle) {
			case "MICROWAVE":
				return CookingStyleType.MICROWAVE;
			case "BRICK_OVEN":
				return CookingStyleType.BRICK_OVEN;
			case "CONVENTIONAL_OVEN":
				return CookingStyleType.CONVENTIONAL_OVEN;
			default:
				return CookingStyleType.CONVENTIONAL_OVEN;
		}
	}

	//update the total price of the pizza from the price of each topping and the price without toppings
	protected abstract double addToppingsToPrice(double priceWithoutToppings);
	public abstract double updatePizzaPrice();
	
	
}
