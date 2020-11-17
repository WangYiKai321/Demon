package com.kai.designPattern.strategy;
/**
 * @Auther: Kai Wang
 * @Date: 2020/10/29
 * @Description:
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }
    public abstract void display();

    public void performQuack(){
        quackBehavior.quick();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
