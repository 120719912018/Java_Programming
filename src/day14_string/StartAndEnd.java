package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {

         String str = "Apples";
         boolean result1=str.startsWith("App");
        boolean result2=str.startsWith("app");
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


        System.out.println(str.startsWith("Apples"));

        System.out.println(str);

        String sentence = "Today is Java day!";
        boolean end1 =  sentence.endsWith("day!");
        System.out.println(end1);
        boolean end2 =  sentence.endsWith("day");
        System.out.println(end2);

        System.out.println(sentence.endsWith("ay!"));
    }
}
