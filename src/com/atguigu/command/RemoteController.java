package com.atguigu.command;


public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int position, Command onCommand, Command offCommand) {
        onCommands[position] = onCommand;
        offCommands[position] = offCommand;
    }

    public void onButtonWasPushed(int position) {
        onCommands[position].execute();
        undoCommand = onCommands[position];
    }

    public void offButtonWasPushed(int position) {
        offCommands[position].execute();
        undoCommand = offCommands[position];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
