package com.nancy;

public class CallPerson {
    public static void main(String[] args) {
        Person p=new Person("Nancy", 26, 2.5, 54, "Black");//calling the constructor
        Person p2=new Person("Dave", 28, 2.8, 78, "Brown");
        Person p3=new Person("Ethan", 30, 1.8, 88, "Light Brown");

        p.printDetails();
        p2.printDetails();
        p3.printDetails();

        p.getBMI();
        p2.getBMI();
        p3.getBMI();

        p.setAge(67);

        p.printDetails();
    }
}
