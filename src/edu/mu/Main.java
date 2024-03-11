package edu.mu;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		order.addPizzaToCart(PizzaType.HAWAIIAN);
		order.addPizzaToCart(PizzaType.MARGHERITA);
		order.addPizzaToCart(PizzaType.SUPREME);
		order.addPizzaToCart(PizzaType.VEGETARIAN);
		order.printPizzaOrderCart(4);
		
		
	
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		//prints pizza order cart. Calls checkout to calculate the bill, throws exception if
		//triggered.
		// TODO
	}

}
