package com.kai.designPattern.command.demon2;
import com.kai.designPattern.command.CeilingFan;
import com.kai.designPattern.command.CeilingFanOffCommand;
import com.kai.designPattern.command.CeilingFanOnCommand;
import com.kai.designPattern.command.GarageDoor;
import com.kai.designPattern.command.GarageDoorDownCommand;
import com.kai.designPattern.command.GarageDoorUpCommand;
import com.kai.designPattern.command.Light;
import com.kai.designPattern.command.LightOffCommand;
import com.kai.designPattern.command.LightOnCommand;
import com.kai.designPattern.command.Stereo;
import com.kai.designPattern.command.StereoOffCommand;
import com.kai.designPattern.command.StereoOnWithCDCommand;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class RemoteLoader {
    public static void main(String[] args) {
        //请求调用者
        RemoteControl remoteControl = new RemoteControl();

        //请求接受者
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        //命令对象包装请求接受者以及对应的动作
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        //给调用者设置命令
        remoteControl.serCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.serCommand(1, kitchenLightOn, livingRoomLightOff);
        remoteControl.serCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.serCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        //调用者执行命令对象
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
