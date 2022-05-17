package ai.jobiK.Otherclasses;

public class TestShapes {
 
	public static void main(String[] args) {
		
		//Shape shape = new Shape();// it gives error we cannot instantiate an abstract class
		Shape Ref; //reference must
		Ref = new  Rectangle();
		Ref.area();
		System.out.println("area of  the Rectangle is : "+ Ref.area());
		
		Ref = new Square();
		Ref.area();
		System.out.println("area of the square is : "+Ref.area());
		
		Ref = new Circle();
		Ref.area();
		System.out.println("area of the circle is : "+Ref.area());
		
		Ref = new Triangle();
		Ref.area();
		System.out.println("area of the triangle is : " + Ref.area());
		
		Ref = new Trapezium();
		Ref.area();
		System.out.println("area of the Trapezium is : " + Ref.area());
		
		Ref = new Ellipse();
		Ref.area();
		System.out.println("area of the Ellipse is : " + Ref.area());
		
		Ref = new Circle();
		Ref.area();
		System.out.println("area of the cube is : " + Ref.area());
		
		Ref = new Cylinder();
		Ref.area();
		System.out.println("area of the Cylinder is : " + Ref.area());
		
		Ref = new Cone();
		Ref.area();
		System.out.println("area of the Cone is : " + Ref.area());
		
		Ref = new Sphere();
		Ref.area();
		System.out.println("area of the Sphere is : " + Ref.area());
		
		Ref = new Parallelogram();
		Ref.area();
		System.out.println("area of the Sphere is : " + Ref.area());
		
		Ref = new HemiSphere(12);
		Ref.area();
		System.out.println("area of the HemiSphere is : " + Ref.area());
		
	}

}
