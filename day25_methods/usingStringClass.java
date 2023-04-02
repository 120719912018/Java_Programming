package day25_methods;

  import my_util.StringUtil;

public class usingStringClass {





    public static void main(String[] args) {
        System.out.println(StringUtil.reverseStr("java"));
        System.out.println(StringUtil.fixFormat("tOM"));

        System.out.println(StringUtil.frequencyOfCharacter("apple",'z'));
        System.out.println(StringUtil.frequencyOfCharacter("apple",'p'));
    }
}
