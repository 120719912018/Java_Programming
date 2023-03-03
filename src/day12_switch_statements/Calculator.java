package day12_switch_statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double numbOne = input.nextDouble();

        System.out.println("Enter second number:");
        double numTwo = input.nextDouble();

        System.out.println("Select operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\t Enter");
        String operator = input.next();


        double result;

        switch (operator) {
            case "+":
                result = numbOne+ numTwo;
                break;
            case "-":
                if (numbOne>numTwo) {
                    result = numbOne - numTwo;
                } else {
                    result = numTwo - numbOne;
                }
                break;
            case "*":
                result = numbOne * numTwo;
                break;
            case "%" :
                if (numTwo!= 0) {
                    result =numbOne % numTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println(operator+ " is not a valid this calculator");

        }

//        if () {
//
//            System.out.println();
//        }

    }
}
