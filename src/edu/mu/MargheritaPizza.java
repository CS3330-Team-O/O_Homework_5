package edu.mu;

import java.util.ArrayList;


public class MargheritaPizza extends AbstractPizza{
	//default constructor that adds the default toppings to pizza and the default price of the pizza
	MargheritaPizza(){
		super.toppingList = new ArrayList<Toppings>();
		super.toppingList.add(Toppings.TOMATO);
		super.toppingList.add(Toppings.CHEESE);
		super.priceWithoutToppings = 2.50;
		
	}
	
	//creates a deep copy of the margherita pizza
	public void copyPizza(MargheritaPizza pizza1) {
		this.toppingList = pizza1.toppingList;
		this.priceWithoutToppings = pizza1.priceWithoutToppings;
		

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
	//toString constructor that prints out the margherita pizza information
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}

	@Override
	//adds the toppings to the total price of the pizza
	protected double addToppingsToPrice(double priceWithoutToppings) {
		double _totalPrice = priceWithoutToppings;
		for (Toppings topping : super.getToppingList()) {
			_totalPrice += topping.getPrice();
		}
		return _totalPrice;
	}

	@Override
	//updates the pizza price
	public double updatePizzaPrice() {
		super.setTotalPrice(super.getTotalPrice() + addToppingsToPrice(super.getPriceWithoutToppings()));
		return super.getTotalPrice();
	}

}
