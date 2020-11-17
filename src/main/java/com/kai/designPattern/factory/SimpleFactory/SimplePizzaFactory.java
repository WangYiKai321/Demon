package com.kai.designPattern.factory.SimpleFactory;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/11
 * @Description:
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new CheesePizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
