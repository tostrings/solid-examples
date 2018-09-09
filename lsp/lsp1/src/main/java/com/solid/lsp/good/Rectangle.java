package com.solid.lsp.good;

public final class Rectangle implements Area {

	private final double heigth;
	private final double width;

	public Rectangle(double heigth, double width) {
		this.heigth = heigth;
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double result() {
		return this.heigth * this.width;
	}
}
