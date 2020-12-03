package com.kai.designPattern.command;
import com.kai.designPattern.command.Command;
import com.kai.designPattern.command.GarageDoor;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/18
 * @Description:
 */
public class GarageDoorOnCommand implements Command {

    GarageDoor garageDoor ;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
