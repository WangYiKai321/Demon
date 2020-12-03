package com.kai.designPattern.adpter;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/23
 * @Description:
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey say...");
        turkey.gobble();;
        turkey.fly();

        System.out.println("\nThe Duck say...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter say...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quick();
        duck.fly();
    }
}
