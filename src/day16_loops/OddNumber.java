package day16_loops;

public class OddNumber {
    public static void main(String[] args) {

        int num = 2;

        while (num>=2 && num<100) {

            if (num % 2 == 1) {
                System.out.println(num);
            }
            num++;
        }


        System.out.println("---------------------------------");
        int n =1;
             String word2 ="";
           String word = "Java";
          while (word.equalsIgnoreCase(word)){
              if (n < 4){
                  word2 += word.charAt(n);
                  n++;
                  System.out.println(word2);
              }

          }
    }
}
