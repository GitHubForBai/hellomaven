package test0520;

import test0519.Test02;

public class Test0523 extends Test02 {

    public static void main(String[] args) {
        print(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String oringno = Integer.valueOf(x).toString();
        StringBuilder stringBuilder = new StringBuilder(oringno);

        stringBuilder.reverse();

        print(stringBuilder);

        if (oringno.equals(stringBuilder.toString())) {
            return true;
        }

        return false;
    }


    public static boolean isPalindrome2(int x) {
        int sameCopy = x;

        int reverseInt = 0;

        while (x % 10 != 0) {

        }
        return false;
    }

}
