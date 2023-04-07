package day26_methods;

public class Picture {

   public static  void draw () {  //non - parameterized method
       System.out.println("Trying to draw");
   }
   public static void draw (String color ) {  // a parameterize method - overloaded method
       System.out.println("Drawing with color " + color);
   }
    public static void draw (String color,String  color2  ) {  // a parameterize method - overloaded method
        System.out.println("Drawing with color " + color + " and " + color2);
    }
    public static  void draw (int size) {
        System.out.println("Drawing inthis size: " + size );
    }
    public static void main(String[] args) {

    }
}
