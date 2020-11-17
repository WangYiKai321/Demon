package com.kai.designPattern.decorator.test;
import com.kai.designPattern.decorator.Beverage;
import com.kai.designPattern.decorator.DarkRoast;
import com.kai.designPattern.decorator.Espresso;
import com.kai.designPattern.decorator.HouseBlend;
import com.kai.designPattern.decorator.Mocha;
import com.kai.designPattern.decorator.Soy;
import com.kai.designPattern.decorator.Whip;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/10
 * @Description:
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "$ " + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "$ " + beverage3.cost());
    }
}
