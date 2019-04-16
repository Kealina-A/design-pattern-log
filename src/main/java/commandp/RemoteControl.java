package commandp;

import commandp.command.Command;
import commandp.command.NoCommand;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 此遥控器是 2列7行 左列代表开，右列代表关按键，根据对按键设置命令，
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private Stack<Command> undoCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoCommands = new Stack<Command>();

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPush(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
        undoCommands.push(onCommands[slot]);
    }

    public void offButtonWasPush(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
        undoCommands.push(offCommands[slot]);

    }

    public void undoButtonWasPush() {
       undoCommand.undo();
    }

    public void undo2ButtonWasPush() {
        undoCommands.pop();
        Command peek = undoCommands.peek();
        if (null != peek) {
            peek.execute();
        } else {
            System.out.println("已经没有命令了");
        }
    }
}
