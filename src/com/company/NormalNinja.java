package com.company;

public class NormalNinja extends Ninjas{
    public NormalNinja(String name, int health){
        super(name);
    }

    @Override
    public void attack(Devil devil){
        devil.looseHealth(1);
    }


}
