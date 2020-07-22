package strategy.duck_context;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.performQuack();
    }

    public void performFly(){
        flyBehavior.performFly();
    }

    public void swim(){
        System.out.println(" I am swimming ");
    }

    public void display(){
        System.out.println(this);
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}