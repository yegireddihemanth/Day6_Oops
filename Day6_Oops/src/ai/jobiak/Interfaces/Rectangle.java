package ai.jobiak.Interfaces;

public class Rectangle implements Shape {

	@Override
	public double area() {

		return 2 * PIE*radius*radius;
	}

	@Override
	public double perimeter() {
	
		return 2 *PIE *radius;
		
		
		// note if a same method is repeated more than two interfaces then it gives conflict 
	}

}
