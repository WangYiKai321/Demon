package com.kai.designPattern.strategy;
/**
 * @Auther: Kai Wang
 * @Date: 2020/10/29
 * @Description:
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can'n fly");
    }
}
