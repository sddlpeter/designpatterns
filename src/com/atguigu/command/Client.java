package com.atguigu.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("------------按下电灯打开按钮------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("------------按下电灯关闭按钮------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("------------按下撤销按钮------------");
        remoteController.undoButtonWasPushed();


        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        remoteController.setCommand(1, tvOnCommand, tvOffCommand);


        System.out.println("------------按下电视打开按钮------------");
        remoteController.onButtonWasPushed(1);
        System.out.println("------------按下电视关闭按钮------------");
        remoteController.offButtonWasPushed(1);
        System.out.println("------------按下撤销按钮------------");
        remoteController.undoButtonWasPushed();
    }
}
