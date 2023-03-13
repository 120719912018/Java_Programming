public class MethodChaining {
    public static void main(String[] args) {

        String word = "   Java is a great language       ";
        System.out.println(word);

        word = word.trim();

        System.out.println(word);

        word = word.substring(0, word.indexOf(" "));
        System.out.println(word);

        System.out.println("----------------------------------");
        word = "   Java is a great language       ";
        System.out.println(word);
        //TODO: Debug
        word = word.trim().substring(0, 4).toUpperCase();
        System.out.println(word);




    }
}
