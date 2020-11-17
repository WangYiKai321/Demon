package com.kai.designPattern.strategy;
/**
 * @Auther: Kai Wang
 * @Date: 2020/10/29
 * @Description:
 */
public class ModelDuck extends  Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'am a model duck");
    }
}
