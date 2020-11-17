package com.kai.designPattern.decorator;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/10
 * @Description:
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage ;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
