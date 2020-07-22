package strategy.duck_context;

public class FlyNoway implements FlyBehavior{

	@Override
	public void performFly() {
		System.out.println(" I can`t fly ");
	}
    
}