package ai.jobiK.Otherclasses;

public class Ellipse extends Shape {
	double MajorAxis=17;
	double MinorAxis=12;
	@Override
	public double area() {
		
		return Math.PI*MajorAxis*MinorAxis;
	}

}
