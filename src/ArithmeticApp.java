/*
Phillip Yohner
COP 3330C - CRN 24680
January 30, 2024

PART ONE OF TWO
Description:
The purpose of this program - Arithmetic App - is to divide two integers, which the user is prompted to enter,
and return the result.  It will catch an ArithmeticException whenever the denominator (the second number
entered) is zero and return an exception message.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ArithmeticApp extends Exception {
    public static void main (String [] arg){
        try {
            Scanner userInput = new Scanner(System.in);
            int num1 = 0;
            int num2 = 0;

            System.out.println("Enter the first integer (numerator): ");
            num1 = userInput.nextInt();
            String s = userInput.nextLine();
            System.out.println("Enter the second integer (denominator): ");
            num2 = userInput.nextInt();
            s = userInput.nextLine();
            int test = num1/num2; // will generate the exception, when necessary
            double result = (double) num1 / (double) num2;

            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            String formattedResult = decimalFormat.format((double) result);
            System.out.println(num1 + " / " + num2 + " = " + formattedResult);

        } catch (ArithmeticException e){
            System.out.println("An arithmetic exception has occurred. Please run again.\n" + e.toString());
        }
    }
}