package strategy.animal_context;

public class Dog extends Animal {
    
    public void bark(){
        System.out.println("bark bark ");
    }

    @Override
    public void makeSound() {
        bark();
    }
}