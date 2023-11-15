package com.proftelrun.org.lessonthree;

public class Whale extends SeaAnimal implements Flyable,Eatable{

    private boolean hasTail;

    public boolean isHasTail(){
        return hasTail;
    }



    @Override
    public boolean eat(String plants) {
        return false;
    }

    @Override
    public void see() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {
        System.out.println("I am whale and i can fly");

    }

    @Override
    public boolean canEat() {
        return false;
    }
}
