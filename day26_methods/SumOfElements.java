package day26_methods;

public class SumOfElements {

    public static  int sumOfElement (int [] arr ){
    int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static  int sumOfElement2 (int ... arr ){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int [] myArray = {2,3,5,6,14};
        System.out.println(sumOfElement(myArray));
        System.out.println(sumOfElement(new int [] {12,34,56,786,78}) );
        System.out.println(   sumOfElement2( 1,2,3,4,5 ));



    }
}
