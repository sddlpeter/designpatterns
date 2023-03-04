package com.atguigu.facade;

public class Stereo {
    public static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("stereo is on...");
    }
    public void off() {
        System.out.println("stereo is off...");
    }

}
