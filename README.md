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


