package ua.jrc.figures;

public class Circle implements Figure {
	
	private double r; // Radius
	private String color;
	
	public Circle(){
		super();
	}

	public Circle(double r, String color) {
		super();
		this.r = r;
		this.color = color;
	}


	@Override
	public double getSquare() {
		return Math.PI * (r * r);
	}

	@Override
	public String getColor() {
		return color;
	}
	
	public double getDiameter(){
		return r + r;
	}

	@Override
	public String toString() {
		return "Figure: CIRCLE; Square = " + this.getSquare() + "; Color = " + this.getColor() + "; Diameter = " + this.getDiameter();
	}

}
