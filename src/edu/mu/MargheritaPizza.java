package edu.mu;

import java.util.ArrayList;

public class MargheritaPizza extends AbstractPizza {
	MargheritaPizza() {
		ArrayList<Toppings> toppingList = new ArrayList<Toppings>();
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		super.setToppingList(toppingList);
		super.setPriceWithoutToppings(2.50);
		this.updatePizzaPrice();
	}

	public void copyPizza(MargheritaPizza pizza) {
		this.setToppingList(pizza.getToppingList());
		this.setPriceWithoutToppings(pizza.getPriceWithoutToppings());
	}

	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
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
