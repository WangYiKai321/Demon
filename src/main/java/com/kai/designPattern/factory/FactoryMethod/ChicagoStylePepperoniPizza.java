package com.kai.designPattern.factory.FactoryMethod;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/12
 * @Description:
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Granted Pepperoni");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
