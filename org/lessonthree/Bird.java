package com.proftelrun.org.lessonthree;

public class Bird implements Flyable, Eatable{
    @Override
    public void fly() {
        System.out.println("I am bird and i can fly");
    }

    @Override
    public boolean canEat() {
        return true;
    }
}
