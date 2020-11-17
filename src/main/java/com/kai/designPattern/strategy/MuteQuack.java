package com.kai.designPattern.strategy;
/**
 * @Auther: Kai Wang
 * @Date: 2020/10/29
 * @Description:
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quick() {
        System.out.println("<<> Silence >>");
    }
}
