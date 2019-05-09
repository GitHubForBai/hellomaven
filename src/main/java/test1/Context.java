package test1;

public class Context {

    // 引入策略接口
    private IStrategy iStrategy;

    // 声明自定义的构造函数,并指定使用哪个策略
    public Context (IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    // 操作方法
    public void operate () {
        this.iStrategy.operate();
    }
}
