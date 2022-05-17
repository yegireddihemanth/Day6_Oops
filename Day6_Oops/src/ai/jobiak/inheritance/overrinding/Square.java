package ai.jobiak.inheritance.overrinding;

public class Square extends Shape {

	private double side;
	public Square() {
		
	}
	public Square(double side) {
		super();
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	 }
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
	
}
