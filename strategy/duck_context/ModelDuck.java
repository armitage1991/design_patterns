package strategy.duck_context;

public class ModelDuck  extends Duck{

    public  ModelDuck() {
        // TODO Auto-generated method stub
        
        flyBehavior = new FlyNoway();
        quackBehavior = new Quack();


        System.out.println("  i am flying from a model ");

    }
    
}