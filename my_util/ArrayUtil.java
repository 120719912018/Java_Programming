package my_util;

public class ArrayUtil {

    //this method return min num in the array
    public static int minNumInArr (int [] arr) {

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return  min;
    }



    public static void main(String[] args) {

    }
}
