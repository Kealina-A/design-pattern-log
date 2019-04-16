package commandp.command.macro;

import commandp.command.Command;

/**
 * 复合模式,使用宏命令来解耦
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
