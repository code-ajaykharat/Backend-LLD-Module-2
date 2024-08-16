package com.design.patterns.facade;

public class HomeTheater {
    public DVDPlayer dvdPlayer;//association
    public Lights lights;
    public MusicSystem musicSystem;
    public Projector projector;

    public HomeTheater(DVDPlayer dvdPlayer, Lights lights, MusicSystem musicSystem, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.musicSystem = musicSystem;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        dvdPlayer.on();
        projector.on();
        musicSystem.on();
        lights.dim();
        System.out.println("All Set...Enjoy:"+movie);
    }
    public void endMovie(){
        System.out.println("Shutting down...");
        dvdPlayer.off();
        projector.off();
        musicSystem.off();
        lights.lightsOn();
        System.out.println("See you soon...");
    }
}
