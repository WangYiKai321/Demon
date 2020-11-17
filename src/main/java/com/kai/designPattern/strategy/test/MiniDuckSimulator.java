package com.kai.designPattern.strategy.test;
import com.kai.designPattern.strategy.Duck;
import com.kai.designPattern.strategy.FLyRocketPowered;
import com.kai.designPattern.strategy.Mallarduck;

/**
 * @Auther: Kai Wang
 * @Date: 2020/10/29
 * @Description:
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new Mallarduck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new Mallarduck();
        model.performFly();
        model.setFlyBehavior(new FLyRocketPowered());
        model.performFly();
    }
}
