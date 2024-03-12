package edu.mu;

public class MicrowaveCookingStrategy implements ICookingStrategy{
	private final double additionalPrice = 1.0;

	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza.getCookingStrategy() != null){
			return false;
		}
		else {
			pizza.setCookingStrategy(CookingStyleType.MICROWAVE);
			pizza.setCookingPrice(additionalPrice);
			pizza.totalPrice += additionalPrice;
			return true;
		}

	}

}
