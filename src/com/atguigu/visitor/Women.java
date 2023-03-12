package com.atguigu.visitor;

public class Women extends Person{
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
