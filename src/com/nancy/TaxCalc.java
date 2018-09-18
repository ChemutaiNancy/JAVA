package com.nancy;

public class TaxCalc {
    public static void main(String[] args) {
        double income=500000;

        double salary;


        if (income<=147580){
            salary=income-(income*0.1);
            System.out.println("Tax rate is 10%"+" "+"and"+" "+"salary is"+" "+salary);
        }
        else if (income>=147581 && income <=286623){
            salary=income-(income*0.15);
            System.out.println("Tax rate is 15%"+" "+"and"+" "+"salary is"+" "+salary);
        }
        else if (income>=286624 && income<=425666){
            salary=income-(income*0.2);
            System.out.println("Tax rate is 20%"+" "+"and"+" "+"salary is"+" "+salary);
        }
        else if (income>=425667 && income<=564709){
            salary=income-(income*0.25);
            System.out.println("Tax rate is 25%"+" "+"and"+" "+"salary is"+" "+salary);
        }
        else {
            salary=income-(income*0.3);
            System.out.println("Tax rate is 30%"+" "+"and"+" "+"salary is"+" "+salary);
        }
    }
}
