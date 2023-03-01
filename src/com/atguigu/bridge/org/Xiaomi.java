package com.atguigu.bridge.org;

public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("open xiaomi");
    }

    @Override
    public void close() {
        System.out.println("close xiaomi");
    }

    @Override
    public void call() {
        System.out.println("call xiaomi");
    }
}
