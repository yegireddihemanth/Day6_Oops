package ai.jobiK.Otherclasses;

public class HemiSphere extends Shape {

	
	double radius;
	
	public HemiSphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
	
		return 3*Math.PI*radius*radius;
	}



}
