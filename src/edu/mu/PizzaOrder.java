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
	
	public ArrayList<AbstractPizza> getPizzaOrderList() {
		return pizzaOrderList;
	}

	public void setPizzaOrderList(ArrayList<AbstractPizza> pizzaOrderList) {
		try {
			this.pizzaOrderList = pizzaOrderList;
		} catch (Exception e) {
			System.out.println("Error in setPizzaOrderList: " + e);
		}
	}

	public PizzaCookingFactory getPizzaFactory() {
		return pizzaFactory;
	}

	public void setPizzaFactory(PizzaCookingFactory pizzaFactory) {
		try {
			this.pizzaFactory = pizzaFactory;
		} catch (Exception e) {
			System.out.println("Error in setPizzaFactory: " + e);
		}
	}

	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}

	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		try {
			this.cookingStrategy = cookingStrategy;
		} catch (Exception e) {
			System.out.println("Error in setCookingStrategy: " + e);
		}
	}

	public void printListOfToppingsByPizzaOrderId(int orderId) {
		for (AbstractPizza pizza : this.getPizzaOrderList()) {
			if (pizza.getPizzaOrderID() == orderId) {
				for (Toppings topping : pizza.getToppingList()) {
					System.out.println(topping);
				}
				break;
			}
		}
	}

	public void printPizzaOrderCart(int orderID) {
		for (AbstractPizza pizza : this.getPizzaOrderList()) {
			System.out.println(pizza.toString());
		}
	}

	public AbstractPizza getPizzaByOrderID(int orderID) {
		for (AbstractPizza pizza : this.getPizzaOrderList()) {
			if (pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}

	public boolean addPizzaToCart(PizzaType pizzaType) {
		AbstractPizza pizza = this.getPizzaFactory().createPizza(pizzaType);
		this.getPizzaOrderList().add(pizza);
		return true;
	}

	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		for (AbstractPizza pizza : this.getPizzaOrderList()) {
			if (pizza.getPizzaOrderID() == orderID) {
				ArrayList<Toppings> toppings = pizza.getToppingList();
				toppings.add(topping);
				pizza.setToppingList(toppings);
				pizza.updatePizzaPrice();
				break;
			}
		}
		return true;
	}

	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		for (AbstractPizza pizza : this.getPizzaOrderList()) {
			if (pizza.getPizzaOrderID() == orderID) {
				ArrayList<Toppings> toppings = pizza.getToppingList();
				try {
					toppings.remove(topping);
				} catch (Exception e) {
					System.out.println("Topping is already not on pizza.");
				}
				pizza.setToppingList(toppings);
				pizza.updatePizzaPrice();
				break;
			}
		}
		return true;
	}
	
	//Method checks the pizzaOrderList for any uncooked pizza's
	//if there are any uncooked pizza's then true is returned and otherwise false is returned
	public boolean isThereAnyUncookedPizza() {
		for (AbstractPizza pizza : this.getPizzaOrderList()) {
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
        	for (AbstractPizza pizza : this.getPizzaOrderList()) {
            	total += pizza.getTotalPrice();
            	}
        pizzaOrderList.clear();
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
		for (AbstractPizza pizza : this.getPizzaOrderList()) {
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
