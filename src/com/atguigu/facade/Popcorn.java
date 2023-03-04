package com.atguigu.facade;

public class Popcorn {
    public static Popcorn instance = new Popcorn();
    private Popcorn() {

    }
    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn is on...");
    }
    public void off() {
        System.out.println("popcorn is off...");
    }
    public void pop() {
        System.out.println("popcorn is popping...qq");
    }
}
