package ua.jrc.figures;

public class Square implements Figure {
	
	private double a; //Side
	private String color;

	public Square() {
		super();
	}

	public Square(double a, String color) {
		super();
		this.a = a;
		this.color = color;
	}

	@Override
	public double getSquare() {
		return a * a;
	}

	@Override
	public String getColor() {
		return color;
	}
	
	public double getSide(){
		return a;
	}

	@Override
	public String toString() {
		return "Figure: SQUARE; Square = " + this.getSquare() + "; Color = " + this.getColor() + "; Side = " + this.getSide();
	}

}
