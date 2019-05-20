package test0518;

public class BitOperationExercise {

    public static final long LONG_NUMBER_TWO = 2;

    public static void main(String[] args) {
        int testNum = 10;
        printOnConsole(weatherOdd(testNum));
    }


    /**
     * 判断一个整数是否为奇数
     * (odd / even   奇数 / 偶数)
     * @param param
     * @return
     */
    public static boolean weatherOdd(int param) {
        if (param % LONG_NUMBER_TWO == 0) {
            // 能被2整除,说明是偶数,返回false
            return false;
        }
        // 是奇数
        return true;
    }


    public static void printOnConsole(Object object) {
        System.out.println(object == null ? "null" : object.toString());
    }



}
