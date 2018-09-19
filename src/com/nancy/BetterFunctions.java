package com.nancy;

public class BetterFunctions {

    public static void main(String[] args) {
        System.out.println(areaCircle(10));
        double x=areaCircle(2);
        System.out.println(Math.round(x));
        System.out.println(x*3);
        System.out.println(areaCircle(4)+50);
        System.out.println(Math.round(areaCircle(4)));

        String a="keya";

        //call, invoke, use
        System.out.println(calculateAge(1993));
        int age=calculateAge(1980);
        System.out.println(age);

        System.out.println(checkName("nancy chemu"));

        if (checkName("DylanEthan")){
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }

        System.out.println(threeInt(19, 20, 21));
        System.out.println(sapyramid(15,10, 20));

        System.out.println(myname("nancy chemutai"));
    }

    public static double areaCircle( double r){
        double result=Math.PI*r*r;
        return result;
    }

    public static int calculateAge(int yob){
        int age=2018-yob;
        return age;
    }

    public static boolean checkName(String name){
        if (!name.contains(" ")){
            return false;
        }

        if (name.length()<6){
            return false;
        }

        return true;
    }

    //three integers --return the largest

    public static int threeInt(int one, int two, int three){
        if (one>two && one>three) {
            return one;
        }

        if (two>one && two>three){
            return two;
        }

        if (three>one && three>two){
            return three;
        }

        return one;
    }
    //calculate the surface area of the pyramid--return results
    public static double sapyramid(double length, double width, double height){
        double surfaceArea=(length*width)+(1/2*(length+width+length+width))*height;
        return surfaceArea;
    }

    public static String myname(String name){
        String names=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+
                name.substring(6,7).toUpperCase()+name.substring(7).toLowerCase();
        return names;
    }
}
