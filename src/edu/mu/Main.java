package edu.mu;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		System.out.println("----------Order #1----------");
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
		System.out.println("Pizzas in cart:");
		order.printPizzaOrderCart(4);
		//Checkout with all cooked pizzas
		try {
			double total = order.checkout();
			System.out.println("Your total is $" + total);
		} catch (Exception e) {
			System.out.println("You have uncooked pizzas! Cannot checkout");
		}
		System.out.println("----------Order #2----------");
		//Checkout with an uncooked pizza
		order.addPizzaToCart(PizzaType.VEGETARIAN);
		order.addPizzaToCart(PizzaType.MARGHERITA);
		System.out.println("Attempt to checkout with uncooked pizzas: ");
		try {
			double total = order.checkout();
			System.out.println("Your total is $" + total);
		} catch (Exception e) {
			System.out.println("You have uncooked pizzas! Cannot checkout");
		}
		System.out.println("Pizzas in cart:");
		order.printPizzaOrderCart(6);
		//remove and add toppings
		System.out.println("Remove tomato from Vegetarian and add black olive to Margherita: ");
		order.removeToppingFromPizza(5, Toppings.TOMATO);
		order.addNewToppingToPizza(6, Toppings.BLACK_OLIVE);
		order.printPizzaOrderCart(6);
		//get order 5
		System.out.println("Pizza with order ID 5: ");
		System.out.println(order.getPizzaByOrderID(5));
		//get toppings for order 6
		System.out.println("Toppings with order ID 6: ");
		order.printListOfToppingsByPizzaOrderId(6);
		//Cook order 2
		order.selectCookingStrategyByPizzaOrderID(5, CookingStyleType.MICROWAVE);
		order.selectCookingStrategyByPizzaOrderID(6, CookingStyleType.BRICK_OVEN);
		//Checkout
		try {
			double total = order.checkout();
			System.out.println("Your total is $" + total);
		} catch (Exception e) {
			System.out.println("You have uncooked pizzas! Cannot checkout");
		}
	}
}
