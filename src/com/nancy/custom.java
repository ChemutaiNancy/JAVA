package com.nancy;

public class custom {
    public static void areaCircle(double radius){
        double result = Math.PI*radius*radius;

        System.out.println("Area is"+" "+result);
    }

    public static void main(String[] args) {
        areaCircle(9.2);
        areaCircle(8.8);
        areaCircle(5.6);

        areaRec(30.2, 12.5);
        areaRec(54.3, 29.1);

        volCylinder(19, 3, 30);

        surfaceAreaCy(7,2,7);

        meters(650);
        kilograms(80);
    }

    public static void areaRec(double length, double width){

        double area = length*width;

        System.out.println("Area of a Rectangle is "+" "+area);
    }

    //calculate the volume of a cylinder

    public static  void volCylinder(double radius, double power, double height){
        double vol = Math.PI*Math.pow(radius,power)*height;

        System.out.println("Volume of a cylinder is"+" "+vol);
    }


    //surface area of a closed cylinder

    public static void surfaceAreaCy(double radius, double power, double height){
        double surfaceArea=(2*Math.PI*Math.pow(radius, power))+(2*Math.PI*radius*height);

        System.out.println("Surface area of a closed cylinder"+" "+surfaceArea);
    }

    //convert cm to meters
    public static void meters(double number){
        double meter=number/100;

        System.out.println(number+" "+"cm"+" "+"is"+" "+meter+"meters");
    }

    //convert weight in tonnes to kilograms
    public static void kilograms(double number){
        double kilograms=number*1000;
        System.out.println(number+" "+"tonnes"+" "+"is"+" "+kilograms+"kilograms");
    }
}
