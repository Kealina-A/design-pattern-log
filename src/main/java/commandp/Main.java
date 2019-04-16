package commandp;

import commandp.command.Command;
import commandp.command.fan.FanHighCommand;
import commandp.command.fan.FanMiddleCommand;
import commandp.command.fan.FanOffCommand;
import commandp.command.macro.MacroCommand;
import commandp.entity.Fan;
import commandp.entity.Light;
import commandp.command.light.LightOffCommand;
import commandp.command.light.LightOnCommand;

public class Main {

    public static void main(String[] args) {

        //灯的开关设置
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("客厅");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        remoteControl.onButtonWasPush(0);
        remoteControl.offButtonWasPush(0);
        remoteControl.undoButtonWasPush();
        System.out.println();

        //风扇开关设置
        RemoteControl remoteControl1 = new RemoteControl();
        Fan fan = new Fan();
        FanHighCommand fanHighCommand = new FanHighCommand(fan);
        FanMiddleCommand fanMiddleCommand = new FanMiddleCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);


        remoteControl1.setCommand(0,fanHighCommand,fanOffCommand);
        remoteControl1.setCommand(1,fanMiddleCommand,fanOffCommand);

        remoteControl1.onButtonWasPush(0);
        remoteControl1.offButtonWasPush(0);
        remoteControl1.onButtonWasPush(1);
        remoteControl1.offButtonWasPush(1);
        remoteControl1.undoButtonWasPush();
        System.out.println();

        //复合模式设置，一个按键控制开灯和风扇开high档
        RemoteControl remoteControl2 = new RemoteControl();
        Command[] onCommands = {fanHighCommand ,lightOnCommand};
        Command[] offCommands = {fanOffCommand ,lightOffCommand};

        MacroCommand partyOnCommand = new MacroCommand(onCommands);
        MacroCommand partyOffCommand = new MacroCommand(offCommands);

        remoteControl2.setCommand(0,partyOnCommand,partyOffCommand);
        remoteControl2.onButtonWasPush(0);
        remoteControl2.offButtonWasPush(0);
        remoteControl2.undoButtonWasPush();
        System.out.println();

        //撤消动作使用
        RemoteControl remoteControl3 = new RemoteControl();
        remoteControl3.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl3.setCommand(1,fanHighCommand,fanOffCommand);
        remoteControl3.setCommand(2,fanMiddleCommand,fanOffCommand);

        remoteControl3.onButtonWasPush(0);
        remoteControl3.onButtonWasPush(1);
        remoteControl3.onButtonWasPush(2);
        remoteControl3.undo2ButtonWasPush();
        remoteControl3.undo2ButtonWasPush();
    }
}
