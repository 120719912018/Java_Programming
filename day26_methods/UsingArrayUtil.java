package day26_methods;

import my_util.ArrayUtil;
import my_util.StringUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {

        int [] myArray = {2,3,4,5,6,7};
        int num =8;
        System.out.println(ContainArray.containArr(myArray, 7));


       boolean result = ArrayUtil.containArr(myArray, num);
        System.out.println(result);
    }

}
