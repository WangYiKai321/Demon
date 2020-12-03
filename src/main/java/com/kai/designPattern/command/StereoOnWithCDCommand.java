package com.kai.designPattern.command;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }
}
