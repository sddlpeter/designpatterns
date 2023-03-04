package com.atguigu.facade;

public class TheaterLight {
    public static  TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on () {
        System.out.println("theater light is on...");
    }

    public void off() {
        System.out.println("theater light is off...");
    }

    public void dim() {
        System.out.println("theater light is dim...");
    }

    public void light() {
        System.out.println("theater light is light...");
    }
}
