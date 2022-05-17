package ai.jobiak.inheritance.overrinding;

public class TestOverriding {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.sum();
		b.m();
		b.m1();
		
		  b.m1(12.03,12.30);
		  b.m1(2,2);
		  
		  b.sum();
		 b.m("hello", "world");

	} 

}
