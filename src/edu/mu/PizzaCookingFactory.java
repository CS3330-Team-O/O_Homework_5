package edu.mu;

public class PizzaCookingFactory {
	private static int orderIDCounter = 1;
	
	//This Class uses the factory method to create a Pizza based on the pizzaType passed in
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		switch(pizzaType) {
		case HAWAIIAN: //creates hawaiian pizza
			HawaiianPizza hawaiian = new HawaiianPizza();
			hawaiian.setPizzaOrderID(orderIDCounter++);
			return hawaiian;
		case MARGHERITA: //creates margherita pizza
			MargheritaPizza margherita = new MargheritaPizza();
			margherita.setPizzaOrderID(orderIDCounter++);
			return margherita;
		case SUPREME://creates supreme pizza
			SupremePizza supreme = new SupremePizza();
			supreme.setPizzaOrderID(orderIDCounter++);
			return supreme;
		case VEGETARIAN://creates vegetarian pizza
			VegetarianPizza vegetarian = new VegetarianPizza();
			vegetarian.setPizzaOrderID(orderIDCounter++);
			return vegetarian;
		default://if the type passed in is none of the above this message is printed and null is returned
			System.out.println("Invalid pizzaType");
			return null;
		}
	}
}
