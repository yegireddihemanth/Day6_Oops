package ai.jobiK.Otherclasses;

public class Cone extends Shape {
	double SlantHeight=27;
	@Override
	public double area() { 
		
		return Math.PI*radius*(radius+SlantHeight);
	}

}
