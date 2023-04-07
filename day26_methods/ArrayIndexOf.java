package day26_methods;

import day04_variables.ShoppingReceipt;

public class ArrayIndexOf {

    public static void main(String[] args) {

        String str = "loop";

        int index = str.indexOf("l");

        int [] arr = {3,1,34,56,66,55};
        int num =55;

        System.out.println(indexOf(arr,55));
        System.out.println(indexOf(new String  [] {"Tom","Jerry","Garfield"},"Jerry"));



    }
    //---------------------------------------------------//

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


    public  static int indexOf (String [] arr, String word) {
        int locationOfElement =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
}
