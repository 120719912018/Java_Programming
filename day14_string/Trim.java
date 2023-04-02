package day14_string;

public class Trim {
    public static void main(String[] args) {
        String name = "    Thursday      ";
        name = name.trim();
        System.out.println(name);
        int numOfCharBeforeTrim = name.length();
        System.out.println(numOfCharBeforeTrim);

        String msg = "   Today we learned good String methods";
        System.out.println(msg.startsWith("Today"));
    }
}
