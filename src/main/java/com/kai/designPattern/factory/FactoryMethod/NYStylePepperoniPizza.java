package com.kai.designPattern.factory.FactoryMethod;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/12
 * @Description:
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";

        toppings.add("Grated Pepperoni");
    }
}
