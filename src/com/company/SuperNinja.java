package com.company;

public class SuperNinja extends Ninjas{
    public SuperNinja(String name){
        super(name);
    }

    public void increaseHealth(){
        if (this.getHealth()==10){
            System.out.println(this.getName() + "can't increase health beyond " + this.getHealth());
        }
        else if(this.getHealth()<=0){
            System.out.println(this.getName() + " can't increase health as you are dead");
        }else{
            this.setHealth(this.getHealth() + 1);
            System.out.println(this.getName() + ": health increased to " + getHealth());

        }

    }

    @Override
    public void attack(Devil devil){
        devil.looseHealth(2);
    }


}
