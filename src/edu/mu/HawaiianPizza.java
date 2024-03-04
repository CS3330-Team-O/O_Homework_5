package edu.mu;

public class HawaiianPizza extends AbstractPizza{
	
	HawaiianPizza(){
		super.toppingList.add(Toppings.CANADIAN_BACON);
		super.toppingList.add(Toppings.CHEESE);
		super.toppingList.add(Toppings.PINEAPPLE);
		super.priceWithoutToppings = 3.00;
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
