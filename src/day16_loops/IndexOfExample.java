package day16_loops;

public class IndexOfExample {
    public static void main(String[] args) {

        String str = "banana";
        System.out.println(str.charAt(0));
        String firstChar=""+str.charAt(str.length()-1);
        System.out.println(firstChar);

        System.out.println(str.lastIndexOf('a'));

    }
}
