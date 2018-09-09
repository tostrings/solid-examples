package com.solid.lsp.good;


/**
 * This class is final, there is no possibility create a new instance
 * without a side value.
 * 
 * The interface `Calculator` help a composition.
 * 
 * */
public class Square implements Area {

	private final double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double result() {
		return side * side;
	}
}
