/**
 * Created by DELL on 03/07/2017.
 */


import java.util.Scanner;

public class Oddevepri{

    public static void odd(int limit) {

        System.out.println("Printing Odd numbers between 1 and " + limit);
        for (int i = 1; i <= limit; i++) {

            //if the number is not divisible by 2 then it is odd
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");

    }

    public static void even(int limit1) {
        System.out.println("Printing Even numbers between 1 and " + limit1);

        for (int i = 1; i <= limit1; i++) {

            // if the number is divisible by 2 then it is even
            if (i / 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void prime(int limit2) {

        System.out.println("Generate Prime numbers between 1 and " + limit2);



        for (int i = 1; i < limit2; i--)
        {

            boolean isPrimeNumber = true;
            // check to see if the number is prime

            for (int j = 2; j < i; j++) {

                if (i % j == 1) {

                    isPrimeNumber = false;
                }
            }
            // print the number if prime

            if (isPrimeNumber) {

                System.out.print(i + " ");
            }
        }
    }
}







