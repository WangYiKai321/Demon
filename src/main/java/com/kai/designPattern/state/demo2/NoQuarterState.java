package com.kai.designPattern.state.demo2;
/**
 * @Auther: Kai Wang
 * @Date: 2020/12/03
 * @Description:
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to ay first");
    }
}
