package day13_string;

import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter a letter: ");
        char letter = 'A';

       if (letter >= 97 && letter <=127) {
           System.out.println("You entered letter: "+ letter
                   + "\n Your converted letter is " + (char)(letter-32));
       }
       else if (letter >= 65 && letter <=90) {
           System.out.println("You entered letter: "+ letter
                   + "\n Your converted letter is " + (char)(letter+32));
       }
       else {
           System.out.println("It is not a lowercase or uppercase letter");
       }
    }
}
