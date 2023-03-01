package com.atguigu.bridge.org;

public class Vivio implements Brand{
    @Override
    public void open() {
        System.out.println("open vivio");
    }

    @Override
    public void close() {
        System.out.println("close vivio");
    }

    @Override
    public void call() {
        System.out.println("call vivio");
    }
}
