
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("TestDriver");
        MallardDuck m1 = new MallardDuck();
        m1.showDuck();
        RubberDuck r1 = new RubberDuck();
        r1.showDuck();
        ThaiDuck t1 = new ThaiDuck();
        t1.showDuck();
        t1.setQuackBehavior(new Quack());
        t1.showDuck();
        
	}

}
