package com.proftelrun.org.lessonone;

public class LessonOneApp {
    public static void main(String[] args) {

        Dog shepherd = new Dog();
        shepherd.setColor("White");
        shepherd.setAge(30);
        shepherd.setBreed("shepherd");

        Dog angryDog = new Dog();
        angryDog.setColor("Black");
        angryDog.setAge(10);
        angryDog.setBreed("yard");

        Dog littleDog = new Dog("little dog", "red");
        littleDog.setAge(5);

        Dog bigDog = new Dog();

        System.out.println(shepherd);
        System.out.println(angryDog);
        System.out.println(littleDog);
        System.out.println(bigDog);

        System.out.println("Color is " + shepherd.getColor());
    }
}
