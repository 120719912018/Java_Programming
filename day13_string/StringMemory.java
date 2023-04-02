package day13_string;

public class StringMemory {
    public static void main(String[] args) {

        String word1= "loop";
        String word2 = "loop";
        System.out.println(word1==word2);
        String word3 = new String("loop");
        String word4 = new String("loop");
        String word5 = new String("loop");

        System.out.println(word3==word4);

         new String("NoReference");

        System.out.println(word3.equals(word4));
        System.out.println(new String("NoReference"));

    }
}
