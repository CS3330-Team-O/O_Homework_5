package edu.mu;

public class SupremePizza extends AbstractPizza{
	SupremePizza(){
		super.toppingList.add(Toppings.TOMATO);
		super.toppingList.add(Toppings.CHEESE);
		super.toppingList.add(Toppings.BELL_PEPPER);
		super.toppingList.add(Toppings.ITALIAN_SAUSAGE);
		super.toppingList.add(Toppings.PEPPERONI);
		super.toppingList.add(Toppings.BLACK_OLIVE);
		super.toppingList.add(Toppings.MUSHROOM);
		super.priceWithoutToppings =3.50;
		
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
