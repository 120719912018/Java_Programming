package day10_a_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Biggest :" + num1);
        }
          else if (num2 >= num1 && num2 >=  num3) {
            System.out.println("Biggest :" + num2);
           }

           else  if (num3 >= num1 && num3 >= num2){
               System.out.println("Biggest :" +num3);
    }
    }
}
