package com.kai.designPattern.TemplateMethod.demo3;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/24
 * @Description:
 */
public class BeverageTestDrive {

    public static void main(String[] args) {
        CaffeeWithHook caffeeWithHook = new CaffeeWithHook();
        System.out.println("\nMaking coffee");
        caffeeWithHook.prepareRecipe();
    }
}
