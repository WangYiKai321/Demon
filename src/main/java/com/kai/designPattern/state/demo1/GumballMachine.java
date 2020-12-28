package com.kai.designPattern.state.demo1;
/**
 * @Auther: Kai Wang
 * @Date: 2020/12/03
 * @Description:
 */
public class GumballMachine {
    //该例子为错误示范例子
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;//保存当前状态
    int count = 0;//糖果的数量


    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can not inert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("Please wait, we are already giving you a gumball");
        }

    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You have not inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can eject, you haven't inserted a quarter yet");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!!");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there is no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned,but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned..");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("TA gumball come rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to ay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }
}
