package com.proftelrun.org.lessonthree;

public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean eat(String plants);

    public abstract void see();


}
