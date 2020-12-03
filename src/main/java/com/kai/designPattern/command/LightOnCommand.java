package com.kai.designPattern.command;


/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
