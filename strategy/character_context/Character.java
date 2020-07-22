package strategy.character_context;

public abstract class Character {

    public WeaponBehavior weaponBehavior;

    public void fight(){
        System.out.println("Fight from super class");
    }

    public void useWeapon(){
        weaponBehavior.useWeapon();
    }


    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    };


}