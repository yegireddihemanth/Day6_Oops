package ai.jobiak.inheritance.overrinding;

public class CreateShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s= new Shape();
		
		
//		double result = s.area();
//		System.out.println(result); 
		 
		Rectangle rect = new Rectangle(36,33);
		//double result1=rect.area();
		System.out.println(rect.area());//
		//System.out.println(result);
		
		circle cir = new circle(23);
		double circleArea = cir.area();
		System.out.println(circleArea);
		
		Square sq = new Square(5);
		System.out.println(sq.area());
		
	}

}
