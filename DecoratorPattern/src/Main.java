import baseclass.BasePizza;
import baseclass.FarmHouse;
import decorator.ExtraCheese;
import decorator.Mushroom;

public class Main {

	public static void main(String args[]) {
		
		BasePizza p1 = new FarmHouse();
		System.out.println(p1.cost());
		
		BasePizza p2 = new ExtraCheese( new FarmHouse());
		System.out.println(p2.cost());
		
		BasePizza p3 = new Mushroom(new ExtraCheese( new FarmHouse()));
		System.out.println(p3.cost());
		
	}
	
}
