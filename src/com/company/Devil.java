package com.company;

public class Devil extends GameCharacter {

    public Devil(String name){
        super(name);
    }

    public void attack(Ninjas ninja) {
        if (ninja.getArmor()) {
            ninja.looseHealth(1);
        }else {
            ninja.looseHealth(2);
        }
    }

//    public void attack(SuperNinja superninja){
//        superninja.increaseHealth();
//    }

    public void stealArmor(Ninjas ninja){
        ninja.looseArmor();
    }


}
