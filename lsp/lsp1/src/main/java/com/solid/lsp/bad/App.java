package com.solid.lsp.bad;

public class App {

	public static void main( String[] args ){

		Rectangle rec = new Rectangle();
		rec.setWidth(10);
		rec.setHeigth(15);
		//should print 150
		
		Rectangle square = new Square();
		square.setWidth(10);
		square.setHeigth(15);
		//should print 150 but will print 225
		
		printArea(square);
		printArea(rec);
    }
	
	public static void printArea(Rectangle rec) {
		System.out.println(rec.area());
	}
}
