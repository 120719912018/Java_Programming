package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String word1 = "last minutes";
        System.out.println(word1.isEmpty());

        word1="";
        System.out.println(word1.isEmpty());

        word1=" ";
        System.out.println(word1.isEmpty());

        word1=" ";
        System.out.println(word1.isBlank());
    }
}
