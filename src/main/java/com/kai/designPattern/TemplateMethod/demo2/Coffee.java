package com.kai.designPattern.TemplateMethod.demo2;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/24
 * @Description:
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }
}
