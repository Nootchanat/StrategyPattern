
public abstract class Duck {
      FlyBehavior flyBehavior;
      QuackBehavior quackBehavior;
      public Duck() {
    	  
      }
      
      public abstract void display();
      
      public void performFly() {
    	  flyBehavior.fly();
      }
      
      public void performQuack() {
    	  quackBehavior.quack();
      }
      
      public void siwem() {
      System.out.println("All Duck float,even decoys");
}
      public void showDuck() {
    	  performQuack();
    	  performFly();
    	  siwem();
    	  display();
      }
      public void setFlyBehavior(FlyBehavior fb) {
    	  flyBehavior = fb;
      }
      
      public void setQuackBehavior(QuackBehavior qb) {
    	  quackBehavior = qb;
      }
}
