package day26_methods;

public class ContainArray {


    public static boolean containArr (int [] arr,int num ){

        boolean result =false;
        for (int each: arr ) {
            if (each == num){
                result=true;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int [] myArray = {2,3,4,5,6,7};
        System.out.println(containArr(myArray,7));
    }
}
