package com.kai.designPattern.command;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCd() {
        System.out.println(name + " stereo is set for CD input");
    }

    public void setDvd() {
        System.out.println(name + " stereo is set for Dvd input");
    }

    public void setRadio() {
        System.out.println(name + " stereo is set Radio  input");
    }

    public void setVolume() {
        System.out.println(name + " stereo volume set to 11");
    }
}
