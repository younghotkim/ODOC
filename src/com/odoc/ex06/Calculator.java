package com.odoc.ex06;

public class Calculator {
	
	private int x;
	private int y;
	
	
	public Calculator () {
		
	}
	
	public Calculator(int x, int y) {
		
		super();
		
		this.x = x;
		
		this.y = y;
	}

	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int plus() {
		
		return this.x+this.y;
		
	}
	
	public int minus() {
		
		return this.x-this.y;
		
	}
	
	public int multiple() {
		
		return this.x*this.y;
		
	}
	
	public int divide() {
		
		return this.x/this.y;
	}

	@Override
	public String toString() {
		return "Calculator [x=" + x + ", y=" + y + "]";
	}
	
	

}
