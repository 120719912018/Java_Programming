package day11_if_statements;

import java.util.Scanner;

/* ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message:
  * */
public class ChooseLanguage {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number based on the language they wanted to use:   " +
                " \n    1 - English\n" +
                "    2 - Spanish\n" +
                "    3 - Turkish\n" +
                "    4 - Russian\n" +
                "    5 - French\n" +
                "    6 - Azerbaijan\n\n");
        System.out.println("Enter number: " );
                int languageNum= input.nextInt();
                String message;
                if (languageNum==1) {
                    message="Hello, thank you for the call";
                }
                 else if (languageNum==2){
                    message="Hola, gracies por la llamada";
                }
                else if (languageNum==3){
                    message="Merhaba,aradiginiz icin tesekkurler";
                }
                else if (languageNum==4){
                    message="Privet, spasibo za vash zvanok";
                }
                else if (languageNum==5){
                    message="Merci, .......";
                }
                else if (languageNum==6){
                    message="tez de gorum. Konturum qurtardi";
                }
                else {
                    message="Invalid input";
                }


        System.out.println(message);
    }
}
