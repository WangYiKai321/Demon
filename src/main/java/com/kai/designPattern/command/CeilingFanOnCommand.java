package com.kai.designPattern.command;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}
