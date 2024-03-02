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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double updatePizzaPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
