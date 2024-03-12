package edu.mu;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		
		//adding pizzas to cart
		order.addPizzaToCart(PizzaType.HAWAIIAN);
		order.addPizzaToCart(PizzaType.MARGHERITA);
		order.addPizzaToCart(PizzaType.SUPREME);
		order.addPizzaToCart(PizzaType.VEGETARIAN);
		
		//selects how the pizza is cooked
		order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.BRICK_OVEN);
		order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.CONVENTIONAL_OVEN);
		order.selectCookingStrategyByPizzaOrderID(3, CookingStyleType.MICROWAVE);
		order.selectCookingStrategyByPizzaOrderID(4, CookingStyleType.BRICK_OVEN);
		order.printPizzaOrderCart(4);
		try {
			order.checkout();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		//prints pizza order cart. Calls checkout to calculate the bill, throws exception if
		//triggered.
		

	}

}
