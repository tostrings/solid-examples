package com.solid.dip.bad;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main( String[] args ){

		Guitarist guitarist = new Guitarist();

		Violinist violinist = new Violinist();

        List<Object> orchestra = new ArrayList<>();
        orchestra.add(guitarist);
        orchestra.add(violinist);

        orchestra.forEach(o -> {
            if(o instanceof  Guitarist) {
                ((Guitarist)o).playGuitar();
            }

            if (o instanceof  Violinist) {
                ((Violinist)o).playViolin();
            }
        });
    }

}
