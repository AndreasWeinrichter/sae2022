package at.ac.fhwn.sae.Lession2;
import java.util.Scanner;

public class Fibonacci {
        public static long getFibonacci(int inputGetFib) {
            if (inputGetFib == 0)
                return 0;
            else if (inputGetFib == 1)
                return 1;
            else
                return getFibonacci(inputGetFib - 1) + getFibonacci(inputGetFib - 2);
        }

        public static long getFibonacciIterative(int inputGetFib){
            long num1 = 0;
            long num2 =1;
            long num3 = 0;
            int x = inputGetFib;
            if (inputGetFib == 0) {
                return num1;
            }else if (inputGetFib == 1){
                return num2;
            }else{
                while (x >= 2){
                    num3 = num1 + num2;
                    num1 = num2;
                    num2 = num3;
                    x--;}
                return num3;
            }
        }


    public static void main(String[]args){
        System.out.println("Fibbonacci Berechnung: ");
        System.out.println("Die wie vielte Fibonacci Stelle wollen Sie berechnen? ");
        Scanner in = new Scanner(System.in);
        int inputGetFib = Integer.parseInt(in.next());
        System.out.println("Rekursiv: " +getFibonacci(inputGetFib));
        System.out.println("Schleife: " + getFibonacciIterative(inputGetFib));
    }
}
/**
 * Rekursiver Aufruf StackOverflow ab ca 46. Stelle
 * Einschränkung von int --> long (Variablen overflow)
 * Negative Zahlen sind nicht möglich --> Fehlercode
 * Der Code müsste angepasst werden..
 */
