package com.atguigu.mediator;

public class Tv extends Colleague{
    public Tv(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTv() {
        System.out.println("tv is started");
    }

    public void stopTv() {
        System.out.println("tv is stopped");
    }
}
