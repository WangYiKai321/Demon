package com.kai.designPattern.factory.FactoryMethod;
import java.util.Objects;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/13
 * @Description:
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (Objects.equals(type, "cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (Objects.equals(type, "veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (Objects.equals(type, "clam")) {
            return new ChicagoStyleClamPizza();
        } else if (Objects.equals(type, "pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
