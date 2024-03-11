package edu.mu;

public class MicrowaveCookingStrategy implements ICookingStrategy{

	private final double additionalPrice = 1.0;

	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza.getCookingStrategy() != null){
			return false;
		}
		else {
			pizza.setCookingStrategy(new MicrowaveCookingStrategy());
			double price = pizza.getTotalPrice();
			pizza.setTotalPrice(price+additionalPrice);
			return true;
		}

	}

}
