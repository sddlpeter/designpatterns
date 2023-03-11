package com.atguigu.command;

public class TVOnCommand implements Command{
    TVReceiver tvReceiver;
    public TVOnCommand(TVReceiver tv) {
        this.tvReceiver = tv;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
