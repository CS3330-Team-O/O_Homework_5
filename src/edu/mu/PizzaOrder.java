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
	
	//Method checks the pizzaOrderList for any uncooked pizza's
	//if there are any uncooked pizza's then true is returned and otherwise false is returned
	public boolean isThereAnyUncookedPizza() {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getCookingStrategy() == null) {
				return true;
			}
		}
		return false;
	}
	
	//Method checkout calculates the total price in order list if there are no uncooked pizza's
	//otherwise, an exception is thrown states that there are uncooked pizza's
	public double checkout() throws Exception {
		int total = 0;
        if(isThereAnyUncookedPizza() == false) {
        	for (AbstractPizza pizza : pizzaOrderList) {
            	total += pizza.totalPrice;
            	}
        return total;
        }
        else {
        	throw new Exception("Uncooked Pizzas");
        }
	}
	
	//Method takes an integer OrderID and a CookingStyleType for a pizza the method finds the pizza with that order id
	//once the correct pizza is found, the method will setCookingStrategy and use the cookingStrategyType to invoke the correct cook() method
	//Once the cooking is done, true is returned. else if the pizza order ID is not found then false is returned.s
	public boolean selectCookingStrategyByPizzaOrderID(int OrderID, CookingStyleType cookingStrategyType) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == OrderID) {
				switch(cookingStrategyType) {
				  case MICROWAVE:
				    MicrowaveCookingStrategy microwave = new MicrowaveCookingStrategy();
				    microwave.cook(pizza);
				    break;
				  case CONVENTIONAL_OVEN:
				    ConventionalOvenCookingStrategy conventionalOven = new ConventionalOvenCookingStrategy();
				    conventionalOven.cook(pizza);
				    break;
				  default:
				    BrickOvenCookingStrategy brickOven = new BrickOvenCookingStrategy();
				    brickOven.cook(pizza);
				}
				return true;
			}
		}
		return false;
	}

}
