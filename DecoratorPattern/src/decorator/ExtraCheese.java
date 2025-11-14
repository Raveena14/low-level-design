package decorator;

import baseclass.BasePizza;

public class ExtraCheese extends BasePizza{
	BasePizza pizza;
	int cost;
	
	public ExtraCheese(BasePizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public int cost() {
		cost = this.pizza.cost() + 20;
		return cost;
	}
}
