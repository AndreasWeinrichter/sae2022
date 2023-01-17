package at.ac.fhwn.sae.Lession1;


import at.ac.fhwn.sae.Lession3.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number;
        number = 2; //this is a comment
        System.out.println(number);

        int constantVariable = 1;

        constantVariable = 2;


        boolean result = !(number != constantVariable);
        System.out.println(result);

        if(number>2){
            System.out.println("number " + number + " is bigger than 2");
        }else{
            System.out.println("number " + number + " is smaller or equal 2");
        }

        double value = 56.8899888988;
        System.out.println(String.format("value is %.2f",value));

        Scanner in = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = in.next();

        System.out.println("You entered " + input);

        double enteredValue = Double.parseDouble(input);

        Dog dog = new Dog();

    }
}
