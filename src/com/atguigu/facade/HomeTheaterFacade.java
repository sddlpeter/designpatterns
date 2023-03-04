package com.atguigu.facade;

public class HomeTheaterFacade {
    Projector projector;
    DVDPlayer dvdPlayer;
    Popcorn popcorn;
    Screen screen;
    Stereo stereo;
    TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    public void ready() {
        projector.on();
        dvdPlayer.on();
        popcorn.on();
        screen.down();
        stereo.on();
        theaterLight.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        projector.off();
        dvdPlayer.off();
        screen.up();
        stereo.off();
        theaterLight.light();
        popcorn.off();
    }
}
