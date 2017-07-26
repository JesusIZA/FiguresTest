package ua.jrc.figures;

public class Trapezium implements Figure {
	
	//Rectangle triangle
	
	private double a; //Basic 1
	private double b; //Basic 2
	private double h; //Height
	private String color;
		
	public Trapezium(){
		super();
	}
	
	public Trapezium(double a, double b, double h, String color) {
		super();
		this.a = a;
		this.b = b;
		this.h = h;
		this.color = color;
	}
	
	@Override
	public double getSquare() {
		return (a * b) / 2 * h;
	}

	@Override
	public String getColor() {
		return color;
	}
	
	public double getMiddleLine(){
		return (a * b) / 2;
	}
	
	@Override
	public String toString() {
		return "Figure: TRAPEZIUM; Square = " + this.getSquare() + "; Color = " + this.getColor() + "; MiddleLine = " + this.getMiddleLine();
	}

}
