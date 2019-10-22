

public class Sugger extends Decorator{

	public Sugger(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double money() {
		return super.money() + 2.1;
	}
	
	@Override
	public String desc() {
		return super.desc() + "+糖";
	}
}
