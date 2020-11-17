package com.kai.designPattern.decorator;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/10
 * @Description:
 */
public class LowCaffeine extends Beverage{
    public LowCaffeine() {
        description = "Low Caffeine";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
