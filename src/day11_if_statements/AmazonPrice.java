package day11_if_statements;
/*
 Task:
     declare and assign a price variable
     declare and assign a boolean - hasPrime variable

     possible outputs:

         prime member:
             Eligible for 2 day shipping

         not prime and item price is more than or equal 500:
             Eligible for regular free shipping

         not prime and item price is less than 500:
             Not eligible for free shipping. Shipping fee: 3.99

  */
public class AmazonPrice {

    public static void main(String[] args) {
        double price=300;
        boolean isPrime=false;

        if (isPrime) {
            System.out.println(" Eligible for 2 day shipping");
        } else {
            if (price>=500) {
                System.out.println("Eligible for regular free shipping");
            }
            else {
                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
                System.out.println("Your total cost is: price " +(price + 309.99));
            }
        }

    }
}
