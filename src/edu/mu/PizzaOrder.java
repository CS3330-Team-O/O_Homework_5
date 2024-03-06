package edu.mu;

import java.util.ArrayList;

public class PizzaOrder {

	private ArrayList<AbstractPizza> pizzaOrderList;
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;

	public PizzaOrder() {
		this.pizzaFactory = new PizzaCookingFactory();
		this.pizzaOrderList = new ArrayList<AbstractPizza>();
	}

	public void printListOfToppingsByPizzaOrderId(int orderId) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderId) {
				for (Toppings topping : pizza.getToppingList()) {
					System.out.println(topping);
				}
			}
			break;
		}
	}

	public void printPizzaOrderCart(int orderId) {
		for (AbstractPizza pizza : pizzaOrderList) {
			System.out.println(pizza.toString());
		}
	}

	public AbstractPizza getPizzaByOrderID(int orderID) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}

	public boolean addPizzaToCart(PizzaType pizzaType) {
		AbstractPizza pizza = pizzaFactory.createPizza(pizzaType);
		pizzaOrderList.add(pizza);
		return true;
	}

	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderID) {
				ArrayList<Toppings> toppings = pizza.getToppingList();
				toppings.add(topping);
				pizza.setToppingList(toppings);
			}
			break;
		}
		return true;
	}

	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderID) {
				ArrayList<Toppings> toppings = pizza.getToppingList();
				toppings.remove(topping);
				pizza.setToppingList(toppings);
			}
			break;
		}
		return true;
	}

}
