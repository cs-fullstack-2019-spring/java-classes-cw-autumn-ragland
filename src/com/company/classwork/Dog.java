package com.company.classwork;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;
    //Constructor
    public Dog(String name, int age, String breed, String color){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }
    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
    //Method
    public void printDogs(){
        System.out.println("Howdy! My name is "+ this.name);
        System.out.println("I am a " + this.color + " " + this.breed);
        System.out.println("I am " + this.age + " years old in human years");
    }
}
