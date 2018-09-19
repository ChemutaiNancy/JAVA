package com.nancy;

public class Classes {
    public static void main(String[] args) {
      /*int age=BetterFunctions.calculateAge(1965);
        System.out.println(age);

        System.out.println(BetterFunctions.areaCircle(5));*/

        System.out.println(Hesabu.addTwo(3,5));

        //create a variable from hesabu
        Hesabu h=new Hesabu();//create a variable to access the multiply class in hesabu
//        h.multiply(7,9);

        System.out.println(h.multiply(4,3));

        System.out.println(h.CURRENT_MONTH);//non static variable is used to access functions
        System.out.println(Hesabu.CURRENT_YEAR);//shows current static values-access from the class
        String names="Nancy";//anything created from a class is an object
        //an object carries a function that is used to modify the data
//        Hesabu.CURRENT_YEAR=2030;
//        System.out.println(Hesabu.CURRENT_YEAR);

//      Hesabu.addTwo(3,5);

    }
    //uppercase is reserved for classes
    //lowercasse is reserved for functions
}
