package com.kai.designPattern.command.demon3;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/19
 * @Description:
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();//调用者
        CeilingFan ceilingFan = new CeilingFan("Living Room");//接受者

        //对象
        CeilingFanMediumCommand mediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.serCommand(0,mediumCommand,offCommand);
        remoteControlWithUndo.serCommand(1,highCommand,offCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

    }
}
