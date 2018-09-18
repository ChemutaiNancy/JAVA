package com.nancy;

public class functions {
    public static void main(String[] args) {
        String a="Country";
        String b="Continent";

        System.out.println(a.toUpperCase());
        String aa=a.toUpperCase();

        System.out.println(aa);

        int x = a.length();
        a=a.trim();

//if anything generates a boolean you can use an if statement
        if (a.isEmpty()){
            System.out.println("String is empty");
        }
        else {
            System.out.println("String is not empty");
        }

        System.out.println(a.equals(b));

        if (a.equals(b)){
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }

        String z="100";

        //conversion
        int zz=Integer.parseInt(z);//Integer is a class and int is a datatype
        System.out.println(zz+8);

        double dd=Double.parseDouble(z);
        System.out.println(dd+6);

        System.out.println(Math.round(45.9888777));
        System.out.println(Math.sqrt(56));
        System.out.println(Math.pow(2,6));
        System.out.println(Math.abs(10-29));
        System.out.println(Math.PI);

        double area = Math.PI*Math.pow(10,2);

        System.out.println(Math.round(area));
        //chain strings
       b=b.toUpperCase().trim().replace("N", "K");
        System.out.println(b);
    }
}
