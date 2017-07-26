package ua.jrc.figures;

public class Triangle implements Figure {
	
	//Rectangle triangle
	
	private double a; //Katet 1
	private double b; //Katet 2
	private String color;
	
	public Triangle(){
		super();
	}

	public Triangle(double a, double b, String color) {
		super();
		this.a = a;
		this.b = b;
		this.color = color;
	}

	@Override
	public double getSquare() {
		return (a * b) / 2;
	}

	@Override
	public String getColor() {
		return color;
	}
	
	public double getHipotenuse(){
		return Math.sqrt((a * a) + (b * b));
	}
	
	@Override
	public String toString() {
		return "Figure: TRIANGLE; Square = " + this.getSquare() + "; Color = " + this.getColor() + "; Hipotenuse = " + this.getHipotenuse();
	}

}
