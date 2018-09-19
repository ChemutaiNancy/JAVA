package com.nancy;

public class Person {
    //properties
    String name;
    int age;
    double height, weight;
    String color;

    //functions
    //constructor-used to make a person

    public Person(String name, int age, double height, double weight, String color) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails(){
        System.out.println("...................................................");
        System.out.println("Names:"+name);
        System.out.println("Age:"+age);
        System.out.println("Height:"+height);
        System.out.println("Weight:"+weight);
        System.out.println("Color:"+color);
        System.out.println("...................................................");
    }

    public void getBMI(){
        double bmi=weight/Math.pow(height,2);

        System.out.println(".....................................................");
        System.out.println("Names:"+name);
        System.out.println("BMI is :"+bmi);
        System.out.println(".....................................................");
    }
}
