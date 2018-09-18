package com.nancy;

public class arrays {
    public static void main(String[] args) {

        int [] scores={50, 43, 67, 98, 67, 48,75, 76, 54, 62, 45,80};
        String[] names={"Ethan", "Gythan", "Perry", "Penny", "Jean", "Joe"};

        System.out.println(scores[6]);
        System.out.println(names[3]);

        for (String name: names
             ) {
            System.out.println(name);
        }

        for (Integer x:scores
             ) {
            System.out.println(x);
        }
    }
}
