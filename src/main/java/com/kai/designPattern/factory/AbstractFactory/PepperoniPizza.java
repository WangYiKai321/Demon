package com.kai.designPattern.factory.AbstractFactory;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/16
 * @Description:
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        clams = pizzaIngredientFactory.createClams();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
