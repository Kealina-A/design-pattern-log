package commandp.command.fan;

import commandp.command.Command;
import commandp.entity.Fan;

public class FanHighCommand implements Command {

    private Fan fan;
    private int prevSpeed;//保存前一个档数

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.high();
    }

    public void undo() {
        switch (prevSpeed) {
            case Fan.HIGH:fan.high();break;
            case Fan.MIDDLE:fan.middle();break;
            case Fan.LOW:fan.low();break;
            case Fan.OFF:fan.off();break;
            default:fan.off();break;
        }
    }
}
