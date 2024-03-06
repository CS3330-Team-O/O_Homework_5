package edu.mu;

public class PizzaCookingFactory {
	private static int orderIDCounter = 1;
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		//AbstractPizza = null;
		
		switch(pizzaType) {
		case HAWAIIAN:
			HawaiianPizza hawaiian = new HawaiianPizza();
			hawaiian.setPizzaOrderID(orderIDCounter++);
			return hawaiian;
		case MARGHERITA: 
			MargheritaPizza margherita = new MargheritaPizza();
			margherita.setPizzaOrderID(orderIDCounter++);
			return margherita;
		case SUPREME:
			SupremePizza supreme = new SupremePizza();
			supreme.setPizzaOrderID(orderIDCounter++);
			return supreme;
		case VEGETARIAN:
			VegetarianPizza vegetarian = new VegetarianPizza();
			vegetarian.setPizzaOrderID(orderIDCounter++);
			return vegetarian;
		default:
			System.out.println("Invalid pizzaType");
			return null;
		}
	}
}
