package com.kai.designPattern.command;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
