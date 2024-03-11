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
			double price = pizza.getTotalPrice();
			pizza.setTotalPrice(price+additionalPrice);
			return true;
		}

	}

}
