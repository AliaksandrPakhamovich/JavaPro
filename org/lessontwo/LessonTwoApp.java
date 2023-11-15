package com.proftelrun.org.lessontwo;

public class LessonTwoApp {
    public static void main(String[] args) {

        Cat cat = new Cat(16);
        cat.voice();
        cat.setColor("Red");

        WildCat wildCat = new WildCat(10);
        wildCat.voice();
        wildCat.getAge();
        wildCat.setColor("White");

        LittleCat littleCat = new LittleCat(12);
        littleCat.voice();
        littleCat.jump();
        littleCat.setColor("Black");

        SeaCat seaCat  = new SeaCat(5);
        seaCat.voice();
        seaCat.setColor("Blue");
        seaCat.setAge(35);
        seaCat.setHeight(20);
        seaCat.swim();

        System.out.println("Cat color = " +cat.getColor() + " age = " + cat.getAge());
        System.out.println("WildCat color = " + wildCat.getColor());
        System.out.println("LittleCat color = " + littleCat.getColor());
        System.out.println("SeaCat color = " + seaCat.getColor());

    }
}
