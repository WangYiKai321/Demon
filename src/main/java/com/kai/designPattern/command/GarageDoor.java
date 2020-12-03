package com.kai.designPattern.command;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class GarageDoor {

    private String name;


    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + "garage Door is open");
    }

    public void down() {
        System.out.println(name + "garage Door is close");
    }

    public void stop() {
        System.out.println(name + "garage Door is stop");
    }

    public void lightOn() {
        System.out.println(name + "garage Door's light is on");
    }

    public void lightOff() {
        System.out.println(name + "garage Door's light is off");
    }
}
