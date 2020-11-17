package com.kai.designPattern.decorator;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/06
 * @Description:
 */
public abstract  class CondimentDecorator extends Beverage {
    //这里为了让装饰者和被装饰者拥有共同的基类
    public abstract String getDescription();
}
