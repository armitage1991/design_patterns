package strategy.animal_context;

public class Cat extends Animal {
    
    @Override
    public void makeSound() {
        meow();
    }

    public void meow(){
        System.out.println("meow meow");
    }
}