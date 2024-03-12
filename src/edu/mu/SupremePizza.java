package edu.mu;

import java.util.ArrayList;

public class SupremePizza extends AbstractPizza {
	SupremePizza(){
		ArrayList<Toppings> toppingList = new ArrayList<Toppings>();
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.BELL_PEPPER);
		toppingList.add(Toppings.ITALIAN_SAUSAGE);
		toppingList.add(Toppings.PEPPERONI);
		toppingList.add(Toppings.BLACK_OLIVE);
		toppingList.add(Toppings.MUSHROOM);
		super.setToppingList(toppingList);
		super.setPriceWithoutToppings(3.50);
		
	}
	
	public void copyPizza(SupremePizza pizza1) {
		this.toppingList = pizza1.toppingList;
		this.priceWithoutToppings = pizza1.priceWithoutToppings;
		
	}
	
	
	@Override
	public String toString() {
		return "SupremePizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}

	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = priceWithoutToppings;
		for(Toppings topping: toppingList) {
			this.totalPrice += topping.getPrice();
		}
		return this.totalPrice;
	}

	@Override
	public double updatePizzaPrice() {
		this.totalPrice = this.addToppingsToPrice(priceWithoutToppings);
		return 0;
	}

}
