package java8Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl {

    public static void main(String[] args) {
        // 非null字符串为空则返回false
        Predicate<String> p = (String s) -> !s.isEmpty();

        List<String> list = Arrays.asList("", "aaa", "test1");
        List<String> nonList = filter(list, p);
        nonList.forEach((param) -> {
            System.out.println(param);
        });
    }

    public static <T> List<T> filter(List<T> list, Predicate p) {
        // 结果List
        List<T> results = new ArrayList<>();

        // 遍历传入的List,做predicate校验,满足test则放到结果list中
        list.forEach((s) -> {
            if (p.test(s)) {
                results.add(s);
            }
        });

        return results;
    }





}
