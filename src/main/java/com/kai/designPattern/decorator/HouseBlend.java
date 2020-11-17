package com.kai.designPattern.decorator;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/10
 * @Description:
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description  = "House Blend Coffee";

    }

    @Override
    public double cost() {
        return 0.89;
    }
}
