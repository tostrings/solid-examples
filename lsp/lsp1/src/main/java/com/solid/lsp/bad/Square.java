package com.solid.lsp.bad;

public class Square extends Rectangle {

	@Override
	public void setWidth(double width) {
		super.setHeigth(width);
		super.setWidth(width);
	}
	
	@Override
	public void setHeigth(double heigth) {
		super.setWidth(heigth);
		super.setHeigth(heigth);
	}
}
