package com.proftelrun.org.lessonthree;

public interface Flyable {

    void fly();

    default void canFly(){
        System.out.println("");
    }
}
