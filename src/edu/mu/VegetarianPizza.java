package edu.mu;

public class VegetarianPizza extends AbstractPizza{
	VegetarianPizza(){
		super.toppingList.add(Toppings.TOMATO);
		super.toppingList.add(Toppings.CHEESE);
		super.toppingList.add(Toppings.BELL_PEPPER);
		super.toppingList.add(Toppings.BLACK_OLIVE);
		super.toppingList.add(Toppings.MUSHROOM);
		super.priceWithoutToppings = 1.50;
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
