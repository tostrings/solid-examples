package com.solid.dip.good;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main( String[] args ){

		Guitarist guitarist = new Guitarist();

		Violinist violinist = new Violinist();

        List<Musician> orchestra = new ArrayList<>();
        orchestra.add(guitarist);
        orchestra.add(violinist);

        for (Musician m : orchestra) {
            m.play();
        }
    }

}
