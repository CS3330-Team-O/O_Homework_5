package edu.mu;

import java.util.ArrayList;

public class MargheritaPizza extends AbstractPizza{
	//default constructor that adds the default toppings to pizza and the default price of the pizza
	MargheritaPizza(){
		super.toppingList = new ArrayList<Toppings>();
		super.toppingList.add(Toppings.TOMATO);
		super.toppingList.add(Toppings.CHEESE);
		super.priceWithoutToppings = 2.50;
		
	}
	
	//creates a deep copy of the margherita pizza
	public void copyPizza(MargheritaPizza pizza1) {
		this.toppingList = pizza1.toppingList;
		this.priceWithoutToppings = pizza1.priceWithoutToppings;
		
	}
	
	@Override
	//toString constructor that prints out the margherita pizza information
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
	
	@Override
	//adds the toppings to the total price of the pizza
	protected double addToppingsToPrice(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = priceWithoutToppings;
		for(Toppings topping: toppingList) {
			this.totalPrice += topping.getPrice();
		}
		return this.totalPrice;
	}

	@Override
	//updates the pizza price
	public double updatePizzaPrice() {
		this.totalPrice = this.addToppingsToPrice(priceWithoutToppings);
		return 0;
	}
	
}
