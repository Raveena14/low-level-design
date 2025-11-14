package decorator;

import baseclass.BasePizza;

public class Mushroom extends BasePizza{

	BasePizza pizza;
	int cost;
	
	public Mushroom(BasePizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public int cost() {
		cost = this.pizza.cost() + 10;
		return cost;
	}

}
