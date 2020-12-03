package com.kai.designPattern.command.demon1;
import com.kai.designPattern.command.Command;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
//调用者
public class SimpleRemoteControl {

    Command slot;


    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
        ;
    }

}
