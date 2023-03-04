package com.atguigu.facade;

public class Screen {
    public static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("screen is up...");
    }

    public void down() {
        System.out.println("screen is down...");
    }
}
