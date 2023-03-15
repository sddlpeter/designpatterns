package com.atguigu.mediator;

public abstract class Mediator {
    public abstract void register(String name, Colleague colleague);
    public abstract void getMessage(int stateChange, String name);
    public abstract void sendMessage();
}
