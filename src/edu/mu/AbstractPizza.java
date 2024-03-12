package edu.mu;

import java.util.ArrayList;

public abstract class AbstractPizza {
	//fields for AbstractPizza
	protected ArrayList<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected CookingStyleType cookingStrategy = null;
	protected double cookingPrice;
	
	//getter for topping list
	public ArrayList<Toppings> getToppingList() {
		return new ArrayList<Toppings> (toppingList);
	}
	
	//setter for topping list
	public void setToppingList(ArrayList<Toppings> toppingList) {
		try {
			this.toppingList = toppingList;
		}catch (Exception e) {
			System.out.println("Error in setToppingList: " + e);
		}
	}
	
	//getter for priceWithoutToppings
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	
	//setter for priceWithoutToppings
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		try {
			this.priceWithoutToppings = priceWithoutToppings;
		} catch (Exception e) {
			System.out.println("Error in setPriceWithoutToppings: " + e);
		}
	}
	
	//getter for totalPrice
	public double getTotalPrice() {
		return totalPrice;
	}
	
	//stter for totalPrice
	public void setTotalPrice(double totalPrice) {
		try {
			this.totalPrice = totalPrice;
		} catch (Exception e) {
			System.out.println("Error in setTotalPrice: " + e);
		}
	}
	
	//getter for pizzaOrderID
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	
	//setter for pizzaOrderID
	public void setPizzaOrderID(int pizzaOrderID) {
		try {
			this.pizzaOrderID = pizzaOrderID;
		} catch (Exception e) {
			System.out.println("Error in setPizzaOrderID: " + e);
		}
	}
	
	//getter for orderIDCounter
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}
	
	//setter for orderIDCounter
	public static void setOrderIDCounter(int orderIDCounter) {
		try {
			AbstractPizza.orderIDCounter = orderIDCounter;
		}catch(Exception e) {
			System.out.println("Error in setOrderIDCounter: " + e);
		}
	}
	
	//getter for cookingStrategy
	public CookingStyleType getCookingStrategy() {
		return cookingStrategy;
	}
	
	//setter for cookingStrategy
	public void setCookingStrategy(CookingStyleType cookingStrategy) {
		try {
			this.cookingStrategy = cookingStrategy;
		}catch(Exception e) {
			System.out.println("Error in setCookingStrategy: " + e);
		}
	}
	
	//getter for cookingPrice
	public double getCookingPrice() {
		return cookingPrice;
	}
	//setter for cookingPrice
	public void setCookingPrice(double cookingPrice) {
		try {
			this.cookingPrice = cookingPrice;
		}catch (Exception e) {
			System.out.println("Error in setCookingPrice: " + e);
		}
	}
	
	
	//toString constructor that will print the pizza information
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
	
	//abstract methods that will addToppingsToPrice and updatePizzaPrice
	protected abstract double addToppingsToPrice(double priceWithoutToppings);
	public abstract double updatePizzaPrice();
	
	
}
