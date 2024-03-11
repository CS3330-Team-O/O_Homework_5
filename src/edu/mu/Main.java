package edu.mu;

public class Main {

	public static void main(String[] args) {
		PizzaOrder po = new PizzaOrder();
		PizzaCookingFactory pcf = new PizzaCookingFactory();
		
		po.addPizzaToCart(PizzaType.HAWAIIAN);
		po.addPizzaToCart(PizzaType.MARGHERITA);
		po.addPizzaToCart(PizzaType.SUPREME);
		po.addPizzaToCart(PizzaType.VEGETARIAN);
		
		po.printPizzaOrderCart(0);
	}

}
