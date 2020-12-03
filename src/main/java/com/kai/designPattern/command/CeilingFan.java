package com.kai.designPattern.command;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class CeilingFan {
    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " ceiling fan is on high");
    }

    public void off() {
        System.out.println(name + " ceiling fan is  off");
    }

    public void dim() {
        System.out.println(name + " ceiling fan is dim");
    }
}
