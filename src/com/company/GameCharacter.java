package com.company;

public class GameCharacter {
    private String name;
    private int health;

    public GameCharacter(String name){
        this.name=name;
        this.health=10;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setHealth(int health){
        this.health=health;
    }

    public void looseHealth(int decreaseHealth){
        this.setHealth(this.getHealth()-decreaseHealth);
        if (this.getHealth()<=0){
            System.out.println(this.getName() + " died");
        } else {
            System.out.println(this.getName() + " attacked." + this.getName() + ":helth decreased to " + this.getHealth());
        }
    }




}
