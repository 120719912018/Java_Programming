package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int n=2;
//           while (n<=100) {
//               System.out.println(n);
//               n++;
//           }

        while ( n<=100) {
            System.out.println(n);
            n+=2;

        }
                ;

        System.out.println("------------------------------------------");



           while (n%2==0 && n<=100) {
               System.out.println(n);
               n++;
           }

        System.out.println(n);

    }
}
