package day15_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String str = "definition";
        System.out.println("First i: " + str.indexOf("i"));
        System.out.println("Last i: " + str.indexOf("i",7));
        System.out.println("Last i: " + str.lastIndexOf("i"));
    }
}
