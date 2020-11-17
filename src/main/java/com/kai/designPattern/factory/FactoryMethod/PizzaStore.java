package com.kai.designPattern.factory.FactoryMethod;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/13
 * @Description:
 */

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
