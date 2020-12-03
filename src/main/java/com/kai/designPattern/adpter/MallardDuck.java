package com.kai.designPattern.adpter;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/23
 * @Description:
 */
public class MallardDuck implements Duck {
    @Override
    public void quick() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I' am flying");
    }
}
