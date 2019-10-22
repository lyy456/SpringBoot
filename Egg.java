

public class Egg extends Decorator{

	public Egg(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double money() {
		return super.money() + 3.9;
	}
	
	@Override
	public String desc() {
		return super.desc() + "+鸡蛋";
	}
}
