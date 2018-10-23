package com.solid.dip.good;

public class Violinist implements Musician {

    @Override
    public void play() {
        playViolin();
    }

    public void playViolin(){
        System.out.println("Playing violin");
    }

}
