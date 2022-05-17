package ai.jobiK.Otherclasses;

public class Cylinder extends Shape {

	@Override
	public double area() {
		
		return 2*Math.PI*(radius+height);
	}

}
