package com.nancy;

public class BmiCalc {
    public static void main(String[] args) {//psv
        double weight=78;
        double height=1.64;

        double bmi=weight/(height*height);


        if (bmi<=15){
            System.out.println("Very severe underweight");
        }
        else if (bmi<=16 && bmi>15){
            System.out.println("Severely underweight");
        }
        else if (bmi<=18.5 && bmi>16){
            System.out.println("Underweight");
        }
        else if (bmi<=25 && bmi>18.5){
            System.out.println("Normal(healthy weight)");
        }
        else if (bmi<=30 && bmi>25){
            System.out.println("Overweight");
        }
        else if (bmi<=35 && bmi>30){
            System.out.println("Obese Class I (Moderately obese)");
        }
        else if (bmi<=40 && bmi>35){
            System.out.println("Obese Class II (Severely obese)");
        }
        else if (bmi<=45 && bmi>40){
            System.out.println("Obese Class III (Very severely obese)");
        }
        else if (bmi<=50 && bmi>45){
            System.out.println("Obese Class IV (Morbidly Obese)");
        }
        else if (bmi<=60 && bmi>50){
            System.out.println("Obese Class V (Super Obese)");
        }
        else if (bmi>60){
            System.out.println("Obese Class VI (Hyper Obese)");
        }
    }
}
