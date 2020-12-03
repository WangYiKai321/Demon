package com.kai.designPattern.command;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + "light is on");
    }

    public void off() {
        System.out.println(name + "light is off");
    }
}
