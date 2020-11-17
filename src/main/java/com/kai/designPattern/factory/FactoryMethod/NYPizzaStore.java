package com.kai.designPattern.factory.FactoryMethod;
import java.util.Objects;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/13
 * @Description:
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (Objects.equals(type, "cheese")) {
            return new NYStyleCheesePizza();
        } else if (Objects.equals(type, "veggie")) {
            return new NYStyleVeggiePizza();
        } else if (Objects.equals(type, "clam")) {
            return new NYStyleClamPizza();
        }else if (Objects.equals(type, "pepperoni")) {
            return new NYStylePepperoniPizza();
        }else {
            return null;
        }
    }
}
