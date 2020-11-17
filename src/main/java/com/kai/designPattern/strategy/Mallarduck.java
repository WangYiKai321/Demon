package com.kai.designPattern.strategy;
/**
 * @Auther: Kai Wang
 * @Date: 2020/10/29
 * @Description:
 */
public class Mallarduck extends Duck {
    public Mallarduck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'am a real Mallard duck");
    }
}
