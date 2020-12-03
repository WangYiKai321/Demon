package com.kai.designPattern.TemplateMethod.demo2;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/24
 * @Description:
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        //这个方法为我们的模板方法
        //1.它用作一个算法的模板，在这个例子中算法是用来制作咖啡因饮料
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
