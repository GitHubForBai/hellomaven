package test0518;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * List交集、并集、差集、交集的补集
 */
public class ListExercise {

    public static void main(String[] args) {
        test1();
    }



    public static void test1() {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        list1.add("ok");

        List<String> list2 = new ArrayList<>();
        list2.add("c#");
        list2.add("world");
        list2.add("ms");

//        printOnConsole("1.求交集  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
//        List<String> list3 = new ArrayList<>();
//        for (String str : list1) {
//            for (String str1 : list2) {
//                if (str.equals(str1)) {
//                    list3.add(str);
//                }
//            }
//        }
//
//        list3 = list3.stream().distinct().collect(Collectors.toList());
//        list3.forEach((p) -> printOnConsole(p));

        printOnConsole("1.求并集  ↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        List<String> list4 = new ArrayList<>();
        list1.addAll(list2);
        list4 = list1;
        list4.forEach((p) -> printOnConsole(p));

        list1.retainAll(list2);

    }


    public static void printOnConsole(Object object) {
        System.out.println(object == null ? "null" : object.toString());
    }

}
