package day12_switch_statements;

import java.util.Scanner;

public class DayInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a day number: ");
         int number =input.nextInt();

         switch (number) {
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wed");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
             case 7:
                 System.out.println("It is weekend");
                 break;
             default:
                 System.out.println("Invalid input");
                 break;
            }

    }
}
