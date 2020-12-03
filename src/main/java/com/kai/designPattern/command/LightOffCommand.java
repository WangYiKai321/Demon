package com.kai.designPattern.command;


/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
