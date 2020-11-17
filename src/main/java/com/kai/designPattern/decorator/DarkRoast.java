package com.kai.designPattern.decorator;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/10
 * @Description:
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
