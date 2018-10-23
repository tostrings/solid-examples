package com.solid.dip.good;

public class Guitarist implements Musician {

    @Override
    public void play() {
        playGuitar();
    }

    public void playGuitar(){
        System.out.println("Playing guitar");
    }
}
