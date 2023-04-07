package day26_methods;

public class TypePromotion {


     public static void use (float f) {
         System.out.println("calling float");
     }
    public static void use (double d) {
        System.out.println("calling double");
    }
    public static void use (long l) {
        System.out.println("calling long");
    }

    public static void main(String[] args) {
            use(2);
            use (3.2);
            use((double)4);

    }
}
