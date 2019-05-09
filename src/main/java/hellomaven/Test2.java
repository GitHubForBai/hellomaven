package hellomaven;

import java.util.*;

public class Test2 {


    public static void main (String[] args) {
        String ss = "c";
        System.out.println(getLength(ss));

    }

    public static String getLongestStr (String s) {


        return "";
    }


    public static int getLength (String s) {
        if ("".equals(s)) {
            return 0;
        }
        if (" ".equals(s)) {
            return 1;
        }
        int resultLong = 0;

        String[] strArray = s.split("");
        if (1 == strArray.length) {
            return 1;
        }

        List<String> list = Arrays.asList(strArray);

        int size = list.size();

        for (int i = 0; i < size; i++) {
            Set<String> set = new HashSet<>();
            set.add(list.get(i));

            for (int j = i + 1; j < size; j ++) {
                boolean addResult = set.add(list.get(j));
                if (!addResult) {
                    resultLong = resultLong > set.size() ? resultLong : set.size();
                    break;
                }
                if (j == size - 1) {
                    resultLong = resultLong > set.size() ? resultLong : set.size();
                }
            }

        }

        return resultLong;
    }


    /**
     *
     *
     * 1dsa321s1dsa32ui
     *
     *
     */

}
