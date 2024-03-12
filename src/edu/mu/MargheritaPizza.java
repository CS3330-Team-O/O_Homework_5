package edu.mu;

import java.util.ArrayList;

public class MargheritaPizza extends AbstractPizza{
	MargheritaPizza(){
		ArrayList<Toppings> toppingList = new ArrayList<Toppings>();
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		super.setToppingList(toppingList);
		super.setPriceWithoutToppings(2.50);
		super.setTotalPrice(3.00);
		this.updatePizzaPrice();
	}
	
	public void copyPizza(MargheritaPizza pizza1) {
		this.toppingList = pizza1.toppingList;
		this.priceWithoutToppings = pizza1.priceWithoutToppings;
		
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
		for(Toppings topping: toppingList) {
			_totalPrice += topping.getPrice();
		}
		return _totalPrice;
	}

	@Override
	public double updatePizzaPrice() {
		super.setTotalPrice(super.getTotalPrice() + addToppingsToPrice(priceWithoutToppings));
		return this.totalPrice;
	}
	
}
