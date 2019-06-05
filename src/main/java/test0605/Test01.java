package test0605;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test01 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "xiaqiu");
        map.put("2", "pangzi");
        map.put("3", "shouzi");

//        println("通过Map的keySet遍历");

//        for (String key : map.keySet()) {
//            println("key = " + key + ", value = " + map.get(key));
//        }

//        println("通过Map.entrySet使用iterator遍历key和value：");
//
//        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            println("key = " + entry.getKey() + ", value = " + entry.getValue());
//        }


//        println("通过Map.entrySet遍历key和value");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            println("key= " + entry.getKey() + " and value= " + entry.getValue());
//        }


        println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            println("value= " + v);
        }

    }


    public static void println(Object o) {
        System.out.println(o != null ? o.toString() : "null");
    }

}
