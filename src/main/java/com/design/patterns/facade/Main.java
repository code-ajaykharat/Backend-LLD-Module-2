package com.design.patterns.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheater hm = new HomeTheater(new DVDPlayer(),new Lights(), new MusicSystem(), new Projector());

        hm.watchMovie("Dilwale");
        System.out.println("-------------------------------");
        hm.endMovie();
    }
}
