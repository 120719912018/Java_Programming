package day15_string;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String sentence = input.nextLine();

        int  firstIndexOfSpace = sentence.indexOf(" ");


        String beginnig = sentence.substring(0,firstIndexOfSpace);
        System.out.println(beginnig);

        String secondPart = sentence.substring(firstIndexOfSpace);
        System.out.println(beginnig);
        System.out.println(secondPart);

    }

}
