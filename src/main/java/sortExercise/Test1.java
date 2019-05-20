package sortExercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0};

//        bubbleSort(array);


//        getAllStringAllCount();

//        insertSort();

        test();
    }

    /**
     * 快速排序(经典)
     * @param array
     */
    public static void quickSort(int[] array) {
        int len = array.length;
        // 轴点位置
        int pivotIndex = len / 2;

        for (int i = 0; i < pivotIndex - 1; i ++) {



        }

    }


    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        int length = array.length;
        int temp = 0;
        for (int i = 0; i < length; i ++) {
            for (int j = 0; j < length - 1; j ++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void getAllStringAllCount() {
        String str = "111hgg2g12jfus3hssssssssvvvvvvvvvvvvvaaaaa";
        Map<Character, Integer> map = new HashMap<>(16);
        for (Character c : str.toCharArray()) {
            map.put(c, (map.get(c) == null ? 0 : map.get(c)) + 1);
        }
        print(map.toString());
    }


    public static void test() {
        int[] array = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10};
        int value = 5;

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = value;

        int temp = 0;

        for (int i = newArray.length - 1; i >= 0; i --) {
            if (newArray[i] > value) {
                temp = newArray[i];
                newArray[i] = value;
                value = temp;
            } else {
                break;
            }
        }

        print(Arrays.toString(newArray));
    }

    public static void insertSort() {
        // 原始数组
        int[] array = new int[]{9, 8, -9, 7, 6, 5, 12, 4, 3, 2, 1, 0};
        // 数组长度
        int len = array.length;

        for (int i = 1; i < len; i ++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j --) {
                if (array[j] > value) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }

        print(Arrays.toString(array));
    }

    public static void print(Object object) {
        System.out.println(object != null ? object.toString() : "object is null !!!");
    }
}
