

public class Test {

	public static void main(String[] args) {
		// 开始搭配
		//创建纯豆浆
		Drink soya = new Soya();
		System.out.println(soya.money());
		System.out.println(soya.desc());
		//加红豆
		Drink redBeanSoya = new RedBean(soya);
		System.out.println(redBeanSoya.money());
		System.out.println(redBeanSoya.desc());
		//向红豆豆浆中加入鸡蛋
		Drink redBeanEggSoya = new Egg(redBeanSoya);
		System.out.println(redBeanEggSoya.money());
		System.out.println(redBeanEggSoya.desc());
		
		//只需要糖豆浆
		Drink ss = new Sugger(soya);
		System.out.println(ss.money());
		System.out.println(ss.desc());
		
		//创建果汁对象
		Drink frt = new Fruit();
		System.out.println(frt.money());
		System.out.println(frt.desc());
		Drink frtEgg = new Egg(frt);
		System.out.println(frtEgg.money());
		System.out.println(frtEgg.desc());
	}

}
