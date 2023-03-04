package com.atguigu.facade;

public class Projector {
    public static Projector instance = new Projector();
    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("projector is on...");
    }
    public void off() {
        System.out.println("projector is off...");
    }
    public void focus() {
        System.out.println("projector is focusing...");
    }
}
