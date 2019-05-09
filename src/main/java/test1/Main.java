package test1;

public class Main {

    public static void main (String[] args) {
        Context context;

        System.out.println("准备执行第1个算法了");

        context = new Context(new StrategyImplOne());
        context.operate();


        context = new Context(new StrategyImplTwo());
        context.operate();
    }
}
