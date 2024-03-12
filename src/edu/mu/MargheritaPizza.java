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

	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		double _totalPrice = 0.0;
		for (Toppings topping : super.getToppingList()) {
			_totalPrice += topping.getPrice();
		}
		return _totalPrice;
	}

	@Override
	public double updatePizzaPrice() {
		super.setTotalPrice(super.getTotalPrice() + addToppingsToPrice(super.getPriceWithoutToppings()));
		return super.getTotalPrice();
	}

}
