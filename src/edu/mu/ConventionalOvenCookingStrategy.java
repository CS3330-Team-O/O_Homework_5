package edu.mu;

public class ConventionalOvenCookingStrategy implements ICookingStrategy{
	private final double additionalPrice = 8.0;

	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza.getCookingStrategy() != null){
			return false;
		}
		else {
			pizza.setCookingStrategy(CONVENTIONAL_OVEN);
			double price = pizza.getTotalPrice();
			pizza.setTotalPrice(price+additionalPrice);
			return true;
		}

	}

}