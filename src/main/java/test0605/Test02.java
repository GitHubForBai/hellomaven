package test0605;

public class Test02 implements Runnable {

    static int  sum = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i ++) {
            sum += i;
        }
        Thread t1 = new Thread(new Test02());
        t1.start();

        Thread t2 = new Thread(new Test02());
        t2.start();

        System.out.println(sum);
    }


    @Override
    public void run() {
        for (int i = 1; i <= 100; i ++) {
            sum += i;
        }
    }
}
