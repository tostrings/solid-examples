package com.solid.isp.bad;


public class App {

    public static void main(String[] args) {

        Player messi = new Messi();
        Player lebron = new KingLebron();

        messi.playBasketball();
        messi.playFootball();

        lebron.playBasketball();
        lebron.playFootball();
    }

}
