package com.solid.isp.bad;

public class Messi implements Player {

    @Override
    public void playFootball() {
        System.out.println("perfect!");
    }

    @Override
    public void playBasketball() {
        System.out.println("kidding?");
    }
}
