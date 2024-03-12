package edu.mu;

//this interface creates a strategy method style of cooking the pizza
//creates a method signature for cooking the pizza and then is implemented in
//BrickOvenCookingStrategy, ConventionalOvenCookingStrategy, and MicrowaveCookingStrategy
public interface ICookingStrategy {
	public boolean cook(AbstractPizza pizza);
	
}
