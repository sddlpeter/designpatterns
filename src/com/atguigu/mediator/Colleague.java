package com.atguigu.mediator;

import javax.print.attribute.standard.Media;

public abstract class Colleague {
    private Mediator mediator;
    public String name;


    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
