package com.kai.designPattern.decorator;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/10
 * @Description:
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";

    }

    @Override
    public double cost() {
        return 1.99;
    }
}
