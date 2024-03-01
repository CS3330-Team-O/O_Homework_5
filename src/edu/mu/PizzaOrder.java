public class PizzaOrder {

  private ArrayList<AbstractPizza> pizzaOrderList;
  private PizzaCookingFactory pizzaFactory;
  private ICookingStrategy cookingStrategy;

  public PizzaOrder() {

  }

  public PizzaOrder(PizzaCookingFactory pizzaFactory, ICookingStrategy cookingStrategy, ArrayList<AbstractPizza> pizzaOrderList) {
    this.pizzaFactory = pizzaFactory;
    this.cookingStrategy = cookingStrategy;
    this.pizzaOrderList = pizzaOrderList;
  }

  public void printListOfToppingsByPizzaOrderId() {

  }

  public void printPizzaOrderCart() {

  }

  public AbstractPizza getPizzaByOrderID(int orderID) {

  }

  public boolean addPizzaToCart(PizzaType pizzaType) {

  }

  public boolean addNewToppingToPizza(int orderID, Toppings topping) {

  }

  public boolean removeToppingFromPizza(int orderID, Toppings topping) {

  }

}
