package day11_if_statements;
   /*

ask a number from user:

if number = between 1 and 10
        if it is even
        or od
else
    number is not in the range

 */


import java.util.Scanner;

public class NestedExample {

    public static void main(String[] args) {

        Scanner input   =new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number=input.nextInt();

         if (number >1 && number <10) {
             if (number %2==0){
                 System.out.println("number is even");
             } else {
                 System.out.println("number is odd");
             }
         }
         else {

             System.out.println("number is not in the range");
         }

    }
}
