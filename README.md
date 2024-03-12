# O_Homework_5

<b><h2>Abstract Class: Abstract Pizza (Isaiah) </h2></b>
<h3>Properties</h3>
protected ToppingList
<br />
protected priceWithoutToppings
<br />
protected pizzaOrderID
<br />
protected orderIDCounter
<br />
protected CookingStrategy
<br />
protected CookingPrice
<br />

<h3>Abstract Methods</h3>
Protected double addToppingsToPrice(double priceWithout)
<br />
protected double updatePizzaPrice()
<br />

<h3>SubClasses</h3>
HawaiianPizza
<br />
VegetarianPizza
<br />
MargheritaPizza
<br />
SupremePizza
<br />

<h3>PizzaType Enum</h3>
HawaiianPizza
<br/>
MargheritaPizza
<br/>
VegetarianPizza
<br/>
SupremePizza
<br/>

<b><h2>Interface ICookingStrategy (Sydney)</h2></b>

<h3>Method</h3>
public boolean cook(AbstractPizza pizza) 
<br/>

<h3>Subclasses</h3>
BrickOvenCookingStrategy
<br />
COnventionalCookingStrategy
<br />
MicrowaveCookingStrategy
<br />

<b><h2>PizzaCookingFactory (Sydney)</h2></b>
<h3>Method</h3>
public AbstractPizza createPizza

<h3>CookingStyleType Enum</h3>
BrickOven
<br />
COnventional
<br />
Microwave
<br />

<b><h2>Pizza Order Class (David) </h2></b>
<h3>Properties</h3>
private pizzaFactor
<br/>
private cookingStrategy
<br/>
private pizzaOrderList
<br/>

<h3>Methods</h3>
public void printListOfToppingsByPizzaOrderID(int orderID)
<br/>
public void printPizzaOrderCart(int orderID)
<br/>
public AbstractPizza getPizzaByOrderID(int orderID)
<br/>
public boolean addPizzaToCart(PizzaType pizzaType)
<br/>
public boolean addNewToppingToPizza(int orderID, Toppings topping)
<br/>
public boolean removeToppingFromPizza(int orderID, Toppings topping)
<br/>
<h4>(Ashley)</h4>
public boolean isThereAnyUncookedPizza()
<br/>
public double checkOut() throws Exception
<br/>
public boolean sselectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType)


