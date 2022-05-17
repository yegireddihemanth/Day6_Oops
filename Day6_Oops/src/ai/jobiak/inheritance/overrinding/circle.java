package ai.jobiak.inheritance.overrinding;

public class circle extends Shape {
private double radius;

public circle() {
	
}

public circle(double radius) {
	super(); 
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}



@Override
public double area() {
	// TODO Auto-generated method stub
	return Math.PI*(this.radius*this.radius);
}

@Override
public String toString() {
	return "circle [radius=" + radius + "]";
}


}


