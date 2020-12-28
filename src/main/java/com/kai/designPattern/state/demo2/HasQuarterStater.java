package com.kai.designPattern.state.demo2;
/**
 * @Auther: Kai Wang
 * @Date: 2020/12/03
 * @Description:
 */
public class HasQuarterStater implements State {
    GumballMachine gumballMachine;

    public HasQuarterStater(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not inert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter return");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turn...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
