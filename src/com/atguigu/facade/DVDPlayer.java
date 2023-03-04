package com.atguigu.facade;

public class DVDPlayer {
    public static DVDPlayer instance = new DVDPlayer();
    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd is on...");
    }
    public void off() {
        System.out.println("dvd is off...");
    }

    public void play() {
        System.out.println("dvd is playing...");
    }

    public void pause() {
        System.out.println("dvd is paused...");
    }
}
