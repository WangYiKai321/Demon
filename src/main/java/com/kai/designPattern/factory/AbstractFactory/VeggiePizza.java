package com.kai.designPattern.factory.AbstractFactory;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/16
 * @Description:
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory ;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
