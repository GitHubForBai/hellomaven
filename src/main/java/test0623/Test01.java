package test0623;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("123");
        list1.add("1234");


        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("sdafdf");
        list2.add("sdfasdf");


        ListDifference<String> listDifference = new ListDifference(list1, list2);

        List<String> leftList = listDifference.getOnlyOnLeft();
        leftList.stream().forEach((p) -> {System.out.print(p + "\n");});
        System.out.println();

        List<String> rightList = listDifference.getOnlyOnRight();
        rightList.stream().forEach((p) -> {System.out.print(p + "\n");});
        System.out.println();

        List<String> bothList = listDifference.getOnBoth();
        bothList.stream().forEach((p) -> {System.out.print(p + "\n");});
        System.out.println();

    }

}
