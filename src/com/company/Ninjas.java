package com.company;

abstract public class Ninjas extends GameCharacter {

    private boolean armor;

    public Ninjas(String name){
        super(name);
        this.armor=true;
    }

    public boolean getArmor() {
        return armor;
    }

    public void setArmor(boolean armor){
        this.armor=armor;
    }



    public void looseArmor(){
        this.armor=false;
        System.out.println(this.getName() + " lost the armor!!");
    }


    public abstract void attack(Devil devil);

    public void gainArmor(){
        if (this.getHealth()<=0){
            System.out.println(this.getName()+"can't gain armor. You are dead.");
        }else {
            if (this.getArmor()) {
                System.out.println(this.getName() + " already has an armor");
            } else {
                this.setArmor(true);
                System.out.println(this.getName()+" armor gained");
            }
        }
    }








}

