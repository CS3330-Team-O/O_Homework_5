package edu.mu;

public class BrickOvenCookingStrategy implements ICookingStrategy {
	private final double additionalPrice = 10.0;

	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza.getCookingStrategy() != null){
			return false;
		}
		else {
			pizza.setCookingStrategy(CookingStyleType.BRICK_OVEN);
			pizza.setCookingPrice(additionalPrice);
			pizza.totalPrice += additionalPrice;
			return true;
		}

	}

}
