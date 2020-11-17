package com.kai.designPattern.strategy;
/**
 * @Auther: Kai Wang
 * @Date: 2020/10/29
 * @Description:
 */
public class FLyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'am flying with a rocket!");
    }
}
