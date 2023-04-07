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

//-------------------------------------------------------------//
    /* this method will accept */
        public static boolean containArr (int [] arr,int num ){

            boolean result =false;
            for (int each: arr ) {
                if (each == num){
                    result=true;
                }
            }

            return result;
        }

//---------------------------------------------------//
    /**
     *
     * This method accepts int array and a number
     * And retrns the index of the number in the array
     * If it does not exist, it returns -1
     */
    public  static int indexOf1 (int [] arr, int num) {
        int locationOfElement =0;
        for (int each: arr) {
            if (each == num)  {
                return locationOfElement;

            } else {
                locationOfElement++;
            }
        }
        return -1;
    }
    //---------------------------------------------------//

    public  static int indexOf (int [] arr, int num) {
        int locationOfElement =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num) {
                return i;
            }
        }
        return -1;
    }
    //---------------------------------------------------//
    /**
     *
     * This method accepts String array and a String
     * And retrns the index of the String in the array
     * If it does not exist, it returns -1
     */
    public  static int indexOf (String [] arr, String word) {
        int locationOfElement =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
    //---------------------------------------------------//
    public static void main(String[] args) {

    }
}
