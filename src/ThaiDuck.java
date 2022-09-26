
public class ThaiDuck extends Duck {

	public ThaiDuck() {
		quackBehavior = new Kab();
		flyBehavior = new  FlyRocketPowered();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm Thai Duck!");
	}

}
