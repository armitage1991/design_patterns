package strategy.duck_context;

public class MallarDuck extends Duck{
    
    MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}