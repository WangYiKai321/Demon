package com.kai.designPattern.factory.FactoryMethod;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/12
 * @Description:
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";

        toppings.add("Grated Reggiano Cheese");
    }
}
