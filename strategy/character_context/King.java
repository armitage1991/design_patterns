package strategy.character_context;

public class King extends Character {

    public King(){
        weaponBehavior = new SwordBehavior();
    }
    public void fight(){

        
        System.out.println("King is fighting");
    }
}