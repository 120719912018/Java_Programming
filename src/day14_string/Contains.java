package day14_string;

public class Contains {
    public static void main(String[] args) {

        String sentence ="Jude is more than sport";
        System.out.println(sentence.contains("is more than"));
        System.out.println(sentence.contains("morethan"));
        System.out.println(sentence.contains("is than"));
        System.out.println(sentence.contains("is") || sentence.contains("than"));
        System.out.println(sentence.contains("is") && sentence.contains("the"));
    }
}
