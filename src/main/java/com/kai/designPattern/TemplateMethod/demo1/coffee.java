package com.kai.designPattern.TemplateMethod.demo1;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/23
 * @Description:
 */
public class coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    public void pourInCup() {
        System.out.println("Pour into cup");

    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

}
