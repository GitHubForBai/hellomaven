package test0625;

public class Test01 {

    public static void main(String[] args) {
//        int[] arrays = new int[] {4, 2, 9, 8, 1, 7};
//        bubbleSort(arrays);
//
//        for (int i : arrays) {
//            System.out.print(i + ", ");
//        }


//        insertionSort();

        int res = biSearch(new int[]{1, 2, 4, 15, 16, 24, 50, 100, 290}, 290);
        System.out.println(res);
    }


    public static int biSearch(int[] array, int posValue) {
        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == posValue) {
                return mid;
            }
            if (array[mid] > posValue) {
                high = mid - 1;
                continue;
            }
            if (array[mid] < posValue) {
                low = mid + 1;
                continue;
            }
        }
        return -1;
    }





    public static void insertionSort() {
        int[] arrays = new int[4];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[3] = 15;


        for (int i : arrays) {
            System.out.print(i + ", ");
        }

//        int i = 7;
//        for (int j = 0; j < arrays.length; j ++) {
//            if (i > arrays[j]) {
//
//            }
//        }
    }




    public static void bubbleSort(int[] arrays) {
        int length = arrays.length;
        for (int i = 0; i < length; i ++) {
            boolean flag = false;
            for (int j = 0; j < length - i - 1; j ++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    flag = true;
                }
                if (!flag) {
                    break;
                }
            }
        }
    }

}
