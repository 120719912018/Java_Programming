package day26_methods;

import java.util.Arrays;

public class AddElement {

   // int [] arr = {23,4,6,6};
    public static int []  addToArr (int [] arr,int num){

        // int newAdd =0;
        int [] arr2 =new int[arr.length+1];

        arr2[arr2.length-1]=num;
        //newAdd=num;
        for (int i = 1; i < arr2.length; i++) {
            arr2[i-1]=arr[i-1];
        }

        // String arrLast= Arrays.toString(arr2);
        // System.out.println(arrLast);
        return  arr2;

    }

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,7,8};

        System.out.println(Arrays.toString(addToArr(myArray,9)));

    }
}
