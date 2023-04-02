package day13_string;

public class RecapMethods {
    public static void main(String[] args) {

        String str= "loop";
        String str2= new String("loop");

        System.out.println("Compare with == " + (str==str2));
        System.out.println(str.equals(str2));

        System.out.println(str.equals("Loop"));
        System.out.println(str.equalsIgnoreCase("Loop"));

        String word1 ="Loop academy";
        System.out.println("To upper case: " + word1.toLowerCase());
        String word2 = "LOOP ACADEMY";
        System.out.println("To lower case: " + word2.toUpperCase());

    }
}
