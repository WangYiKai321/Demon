package com.kai.designPattern.command.demon1;
import com.kai.designPattern.command.GarageDoor;
import com.kai.designPattern.command.GarageDoorOnCommand;
import com.kai.designPattern.command.Light;
import com.kai.designPattern.command.LightOnCommand;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class RemoteControlTest {
    //该类为命令模式客户
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();//调用者
        Light light = new Light("");//请求的接受者
        LightOnCommand lightOnCommand = new LightOnCommand(light);//创建一个命令对象把请求的接受者传递给这个对象

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOnCommand garageOpen = new GarageDoorOnCommand(garageDoor);

        remote.setCommand(lightOnCommand);//把命令传递给调用者
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
