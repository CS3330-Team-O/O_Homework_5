package edu.mu;

public class MargheritaPizza extends AbstractPizza{
	MargheritaPizza(){
		super.toppingList.add(Toppings.TOMATO);
		super.toppingList.add(Toppings.CHEESE);
		super.priceWithoutToppings = 2.50;
		
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
