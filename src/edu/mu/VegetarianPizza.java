package edu.mu;

import java.util.ArrayList;

public class VegetarianPizza extends AbstractPizza{
	VegetarianPizza(){
		ArrayList<Toppings> toppingList = new ArrayList<Toppings>();
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.BELL_PEPPER);
		toppingList.add(Toppings.BLACK_OLIVE);
		toppingList.add(Toppings.MUSHROOM);
		super.setToppingList(toppingList);
		super.setPriceWithoutToppings(1.50);
		super.setTotalPrice(1.50);
		this.updatePizzaPrice();
	}
	
	public void copyPizza(VegetarianPizza pizza1) {
		this.toppingList = pizza1.toppingList;
		this.priceWithoutToppings = pizza1.priceWithoutToppings;
	
	}
	
	
	@Override
	public String toString() {
		return "VegetarianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
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
