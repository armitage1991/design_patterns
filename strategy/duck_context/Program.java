package strategy.duck_context;

public class Program {
    
    public static void main(String[] args)        {
        
        //Duck duck = new MallarDuck();
        Duck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        //duck.performQuack();
        //duck.performFly();


    }
}