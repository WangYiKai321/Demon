package com.kai.designPattern.factory.FactoryMethod;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/12
 * @Description:
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";

        toppings.add("Grated Clam");
    }
}
