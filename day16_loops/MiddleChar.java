package day16_loops;

import java.util.Scanner;

public class MiddleChar {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
       // System.out.println("Enter the word: ");
        //String word=input.next();
        String word = "California";
        int wordLength=word.length();

        if (wordLength % 2==0 ){
            int even=wordLength/2 ;
            int even2=wordLength/2-1;
            char wordChar=word.charAt(even);
            char wordChar2=word.charAt(even2);
            System.out.println("" + wordChar2 + wordChar);
        }
        else if (wordLength % 2 ==1){
            int odd =wordLength/2;
            char wordChar3=word.charAt(odd);

            System.out.println(wordChar3);


        }
        word = "Califohellornia";
        System.out.println(word.indexOf("hello"));

    }
}
