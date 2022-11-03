package com.company;

public class Main {

    public static void main(String[] args) {

        Devil devil1 = new Devil("Devil1");
        SuperNinja superninja1 = new SuperNinja("superninja1");


       devil1.attack(superninja1);
       devil1.attack(superninja1);
       devil1.attack(superninja1);

       devil1.stealArmor(superninja1);

       devil1.attack(superninja1);
       devil1.attack(superninja1);

       superninja1.increaseHealth();

       devil1.attack(superninja1);

       superninja1.gainArmor();

       superninja1.attack(devil1);

       devil1.attack(superninja1);
       devil1.attack(superninja1);
       devil1.attack(superninja1);

       superninja1.increaseHealth();
       superninja1.gainArmor();

    }
}
