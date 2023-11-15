package com.proftelrun.org.lessonone;
public class Dog {

    private String breed;
    private int age;
    private String color;
    private int weight;

    public Dog() {
        System.out.println("Hello");
    }
    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
            }



    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
