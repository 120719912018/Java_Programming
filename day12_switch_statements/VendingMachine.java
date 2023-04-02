package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to the wending machine");
        System.out.println("Please, select one of the following: \n\tDrinks\n\tSnacks\n\tGum");

        String selection = input.next();

        String msg = "";


        switch (selection) {
            case "Drinks":
                System.out.println("You chose drinks (click on 1, 2, 3): \n\t1) Water\n\t2) Soda\n\t3) Juice\n\nYour number");
                int drinkNumber = input.nextInt();
                if (drinkNumber == 1) {
                    msg = "You have selected water";
                } else if (drinkNumber == 2) {
                    msg = "You have selected soda";
                }else if (drinkNumber == 3) {
                    msg = "You have selected juice";
                }
                break;

            case "Sncaks":
                System.out.println("You chose drinks (click on 1, 2, 3): \n\t1) Candle\n\t2) Pringles\n\t3) Chips\n\nYour number");
                int snackNumber = input.nextInt();
                if (snackNumber == 1) {
                    msg = "You have selected water";
                } else if (snackNumber == 2) {
                    msg = "You have selected soda";
                    }else if (snackNumber == 3) {
                    msg = "You have selected juice";
                }
                break;
            case "Gums":
                System.out.println("You chose drinks (click on 1, 2, 3): \n\t1) Love\n\t2) Turbo\n\t3) Dirol\n\nYour number");
                int gumNumber = input.nextInt();
                if (gumNumber == 1) {
                    msg = "You have selected water";
                } else if (gumNumber == 2) {
                    msg = "You have selected soda";
                }else if (gumNumber == 3) {
                    msg = "You have selected juice";
                }
                break;
            default:
                msg="Not valid selection";
        }
        System.out.println(msg);
    }
}
