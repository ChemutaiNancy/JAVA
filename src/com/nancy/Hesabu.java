package com.nancy;

public class Hesabu {
    public static int addTwo(int a, int b){
        return a+b;
    }

    protected int multiply(int x, int y){
        return x*y;
    }

    //final is used when you don't want the value to change
    public final static int CURRENT_YEAR=2018;//creating a constant and it should be in uppercase
    public final String CURRENT_MONTH="September";

    //package or folder specifies family member eg com.nancy
}
