package sortExercise;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0};

        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        int length = array.length;
        int temp = 0;

        for (int i = 0; i < length; i ++) {
            boolean flag = false;
            for (int j = 0; j < length - 1; j ++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
