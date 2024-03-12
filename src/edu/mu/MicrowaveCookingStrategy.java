package edu.mu;

public class MicrowaveCookingStrategy implements ICookingStrategy{
	//set value of additional price for cooking as final so it connot be changed
	private final double additionalPrice = 1.0;

	@Override
	//This function cooks the pizza based on the microwave cooking style type
	public boolean cook(AbstractPizza pizza) {
		//checks to see if cooking strategy is already set,
		if(pizza.getCookingStrategy() != null){
			return false;
		}
		//if null then set the cooking strategy to microwave
				//sets the cooking price to the additional price of the cooking strategy
				//sets the total price of the pizza by adding the total price and the additionalPrice
		else {
			pizza.setCookingStrategy(CookingStyleType.MICROWAVE);
			pizza.setCookingPrice(additionalPrice);
			pizza.setTotalPrice(pizza.getTotalPrice()+additionalPrice);
			return true;
		}

	}

}
