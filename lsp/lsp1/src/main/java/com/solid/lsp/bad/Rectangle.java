package com.solid.lsp.bad;

public class Rectangle {

	private double heigth;
	private double width;

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return this.heigth * this.width;
	}
}
