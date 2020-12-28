package com.kai.designPattern.state.demo2;
/**
 * @Auther: Kai Wang
 * @Date: 2020/12/03
 * @Description:
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
