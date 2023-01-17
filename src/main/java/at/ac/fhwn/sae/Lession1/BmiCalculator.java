package at.ac.fhwn.sae.Lession1;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args){
        System.out.println("BMI Calculator: ");


        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Height in cm: ");
        String height = in.next();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        String weight = in2.next();

        System.out.println("Your Height is " + height + " cm.");
        System.out.println("Your weight is " + weight + " kg.");

        Double DoubleWeight = Double.valueOf(weight);
        //System.out.println(DoubleWeight);

        Double DoubleHeight = Double.valueOf(height);
        //System.out.println(DoubleHeight);

        double bmi;
        bmi = DoubleWeight / Math.pow((DoubleHeight/100),2);

        System.out.println(String.format("Your BMI  is %.2f ",bmi));

        if (bmi <=18.4){
            System.out.println("Ihr BMI ist zu niedrig. Sie sind Untergewichtig!");
        }else if (18.4 < bmi && bmi < 25.0){
            System.out.println("Ihr BMI ist optimal. Sie haben Normalgewicht.");
        }else if (25.0 < bmi && bmi < 30.0){
        System.out.println("Ihr BMI ist zu hoch! Sie haben leichtes Übergewicht!");
        }else if (30.0 < bmi && bmi < 35.0) {
            System.out.println("Ihr BMI ist zu hoch! Sie haben Übergewicht!");
        }else if (35.0 < bmi && bmi < 40.0) {
            System.out.println("Ihr BMI ist zu hoch! Sie haben starkes Übergewicht!");
        }else if (40.0 < bmi) {
            System.out.println("Ihr BMI ist zu hoch! Sie haben sehr starkes Übergewicht!");
        }


    }
}
