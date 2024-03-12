package edu.mu;

import java.util.ArrayList;

public class SupremePizza extends AbstractPizza {
	SupremePizza() {
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
		this.updatePizzaPrice();
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

	// Combines the base price (priceWithoutToppings) and the cost of all the
	// toppings and returns that total.
	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		double _totalPrice = priceWithoutToppings;
		for (Toppings topping : super.getToppingList()) {
			_totalPrice += topping.getPrice();
		}
		return _totalPrice;
	}

	// Comines the cooking price and the combined base price and cost of all the
	// toppings.
	@Override
	public double updatePizzaPrice() {
		super.setTotalPrice(super.getCookingPrice() + addToppingsToPrice(super.getPriceWithoutToppings()));
		return super.getTotalPrice();
	}

}
