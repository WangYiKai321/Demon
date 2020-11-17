package com.kai.designPattern.factory.AbstractFactory;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/16
 * @Description:
 */
public interface PizzaIngredientFactory {
     Dough createDough();
     Sauce createSauce();
     Cheese createCheese();
     Veggies[] createVeggies();
     Pepperoni createPepperoni();
     Clams createClams();
}
