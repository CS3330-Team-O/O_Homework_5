package edu.mu;

import java.util.ArrayList;

public class HawaiianPizza extends AbstractPizza{
  
	HawaiianPizza(){
		ArrayList<Toppings> toppingList = new ArrayList<Toppings>();
		toppingList.add(Toppings.CANADIAN_BACON);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.PINEAPPLE);
		super.setToppingList(toppingList);
		super.setPriceWithoutToppings(3.00);
		super.setTotalPrice(3.00);
		this.updatePizzaPrice();
	}
	
	public void copyPizza(HawaiianPizza pizza1) {
		this.toppingList = pizza1.toppingList;
		this.priceWithoutToppings = pizza1.priceWithoutToppings;
		
	}
	
	@Override
	public String toString() {
		return "HawaiianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
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
