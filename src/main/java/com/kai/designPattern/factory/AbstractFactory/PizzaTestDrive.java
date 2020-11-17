package com.kai.designPattern.factory.AbstractFactory;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/16
 * @Description:
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
