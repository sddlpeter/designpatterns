package com.atguigu.facade;

import org.apache.ibatis.session.Configuration;

import java.util.Map;

public class Client {
    public static void main(String[] args) {

        // without using facade
//        DVDPlayer dvdPlayer = DVDPlayer.getInstance();
//        Projector projector = Projector.getInstance();
//        Popcorn popcorn = Popcorn.getInstance();
//        Screen screen = Screen.getInstance();
//        TheaterLight theaterLight = TheaterLight.getInstance();
//
//        dvdPlayer.on();
//        projector.on();
//        popcorn.on();
//        popcorn.pop();
//        screen.down();
//        theaterLight.dim();
//        dvdPlayer.play();
//        dvdPlayer.off();
//        screen.up();
//        projector.off();
//        theaterLight.light();

        // using facade ...
        HomeTheaterFacade facade = new HomeTheaterFacade();
        System.out.println("------- ready --------");
        facade.ready();
        System.out.println("------- play --------");
        facade.play();
        System.out.println("------- end --------");
        facade.end();

        Configuration config;
    }
}
