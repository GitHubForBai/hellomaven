package test0520;

import test0519.Test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 extends Test02 {

    public static void main(String[] args) {
//        print(reverse(-2147483648));


        print(myAtoi("-abc"));

//        print("   ".trim() + 1111);

    }



    public static int myAtoi(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        if ("-".equals(str)) {
            return 0;
        }

        List<Character> list = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-');
        List<Character> list000 = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        String str1 = str.trim();

        if (str1.isEmpty() || "".equals(str1)) {
            return 0;
        }

        if (!list.contains(str1.charAt(0))) {
            return 0;
        }


        char[] ch = str1.toCharArray();
        int length = ch.length;
        List<Character> list2 = new ArrayList<>();

        if (str.startsWith("-") && !list000.contains(str.charAt(1))) {
            return 0;
        }

        for (int i = 0; i < length; i ++) {
            if (list.contains(ch[i])) {
                list2.add(ch[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        list2.forEach((p) -> sb.append(p));

        String s = sb.toString();

//        if (Double.valueOf(s) > Long.MAX_VALUE) {
//            return Integer.MAX_VALUE;
//        }
//
//        long resultLong = Long.parseLong(s);

        if (Double.valueOf(s) > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (Double.valueOf(s) < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return Integer.valueOf(s);
    }



    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        String numStr = Integer.toString(x);
        if (x > 0) {
            String reversedStr = new StringBuilder(numStr).reverse().toString();
            long resultLong = Long.parseLong(reversedStr);

            if (resultLong > Integer.MAX_VALUE) {
                return 0;
            }

            return new Long(resultLong).intValue();
        } else {
            long abs = Math.abs(new Long(x));
            String reversedStr = new StringBuilder(Long.toString(abs)).reverse().toString();

            long resultLong = 0L - Long.parseLong(reversedStr);

            if (resultLong < Integer.MIN_VALUE) {
                return 0;
            }

            return new Long(resultLong).intValue();
        }
    }

    public static String reverseString(String s) {
        char[] c = s.toCharArray();
        int length = c.length;
        char[] c1 = new char[length];

        for (int i = 0, j = length - 1; i < length && j >= 0; i ++, j --) {
            c1[i] = c[j];
        }

        return String.valueOf(c1);
    }
}
