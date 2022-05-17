package ai.jobiK.Otherclasses;

public class Trapezium extends Shape {
	double a,b=23; //in Trepezium a,b are the lengths of the two sides.
	@Override
	public double area() {
		
		return 0.5* (a+b) *height ;
	}

}
