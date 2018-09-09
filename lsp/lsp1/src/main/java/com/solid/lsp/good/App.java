package com.solid.lsp.good;

public class App {

	public static void main( String[] args ){

		Rectangle rec = new Rectangle(10, 15);
		//should print 150
		
		Square square = new Square(10);
		//should print 100
		
		printResultOfArea(square);
		printResultOfArea(rec);
    }
	
	public static void printResultOfArea(Area area) {
		System.out.println(area.result());
	}
}
