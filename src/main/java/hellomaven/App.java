package hellomaven;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        











//        int[] array = new int[] {2, 7, 11, 15};
//        int[] result = twoSum(array, 26);
//
//        List list = Arrays.asList(result);
//        for (int i : result) {
//            System.out.println(i);
//        }

    }






    public static int[] twoSum11111 (int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }








    public static int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        for (int i = 0; i < nums.length; i ++) {
            int a = target - nums[i];
            int result = findAnotherNum(nums, a, i);
            if (9999999 != result) {
                resultArray[0] = i;
                resultArray[1] = result;
            }
        }
        return resultArray;
    }

    public static int findAnotherNum (int[] nums, int a, int targetIndex) {
        for (int i = 0; i < nums.length; i ++) {
            if (i == targetIndex) {
                continue;
            }

            if (nums[i] == a) {
                return i;
            }
        }
        return 9999999;
    }
}
