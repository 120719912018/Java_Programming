package day14_string;

import java.util.Scanner;
import java.util.SortedMap;

public class Login {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please, enter your username: ");

        String userName=input.next();
        System.out.println("Before, toLowerCase() method: " + userName);

        userName = userName.toLowerCase();
        System.out.println("After .toLowerCase() method: " + userName);

        System.out.println("Enter a pasword:");
        String password = input.next();

        int passwordLength=password.length();
        System.out.println(passwordLength);
      //  userName= userName.toUpperCase()
        if (passwordLength>= 8 && userName.equals("loopcamp")){
            System.out.println("You are logged in as " +userName);
        } else {
            if (passwordLength<8) {
                System.out.println("Password length does not match");
            }
            if (!userName.equals("loopcamp")){
                System.out.println("Invalid password");
            }
            //userName.startsWith("khoshgadam");

        }
    }
}
