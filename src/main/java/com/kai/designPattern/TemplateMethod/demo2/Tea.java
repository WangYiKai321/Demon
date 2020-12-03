package com.kai.designPattern.TemplateMethod.demo2;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/24
 * @Description:
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
