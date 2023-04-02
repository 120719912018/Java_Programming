package day25_methods;

public class FrequencyOfCharacter {

    public static int frequencyOfCharacter (String word ,char  a){
        int  count=0;

        for (int i = 0; i < word.length() ; i++) {
            // System.out.print(word.charAt(i)+ " ");
            char word2 = word.charAt(i);
            if (word2==a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
