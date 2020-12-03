package com.kai.designPattern.adpter;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/23
 * @Description:
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;//取得要适配的对象的引用
    }

    @Override
    public void quick() {
        turkey.gobble();//适配器的接口转换
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();//适配器的接口转换,鸭子可以飞的很远但是火鸡只能短途飞行，因此需要调用5次飞行来模拟鸭子飞行
        }

    }
}
