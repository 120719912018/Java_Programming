package day11_if_statements;
   /* /*
inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
example expected:
    pin: 1552
    ssn: 1234

outputs:

when the pincode and ssn match the expected print:
    Authentication successful

when the pincode or ssn are not correct print:
    Authentication failed

when the pincode was not correct print:
    incorrect pin code

when the ssn is not correct print:
    invalid ssn
 */

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Please, enter for 4 digits pincode: ");
        int userPincode =input.nextInt();

        System.out.println("Enter your last 4 SSN digits: ");
        int user$nn$Digits = input.nextInt();

        int expectedPincode=1234;
        int expected4$nnDigit = 4321;

        if (userPincode ==expectedPincode && user$nn$Digits==expected4$nnDigit){
            System.out.println("Logged in successfully");
        }else {
            if (userPincode!=expectedPincode ){
                System.out.println("invalid pin");
            }if (user$nn$Digits!=expected4$nnDigit ){
                System.out.println("invalid SSN");
            }

    }
}}
