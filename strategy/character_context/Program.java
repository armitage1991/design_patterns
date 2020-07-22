package strategy.character_context;

public class Program {

    public static void main(String[] args) {
        
        Character king = new King();

        king.fight();
        king.useWeapon();
        king.setWeaponBehavior(new SwordBehavior());
        king.useWeapon();

    }
    
}