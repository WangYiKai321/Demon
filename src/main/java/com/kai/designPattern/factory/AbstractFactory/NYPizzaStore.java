package com.kai.designPattern.factory.AbstractFactory;


import java.util.Objects;


/**
 * @Auther: Kai Wang
 * @Date: 2020/11/16
 * @Description:
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza ;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (Objects.equals(type, "cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (Objects.equals(type, "veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggies Pizza");
        } else if (Objects.equals(type, "clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (Objects.equals(type, "pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else {
            return null;
        }
        return pizza;
    }
}
