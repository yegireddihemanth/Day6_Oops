package ai.jobiak.inheritance.overrinding;

public class B extends A {
	
	

	public B() {
		System.out.println("B()  invokes first");
		//m();
		m1();
		System.out.println("constructior body  excecuted");
	}
	
	 
	  void sum() { 
		 m1(); 
	  System.out.println("method m1() called from sum()"); }
	  void m1() {
	  
	  }
	  
	  void m() {
		   System.out.println("welcome to class B"); 
		   }
	  
	  void m(String a, String b) {
		  System.out.println("hello world");
	  }
	  void m1(int a, int b) { System.out.println("int"); }
	  
	  void m1(double a, double b) 
	  { System.out.println("double"); }
	
	 
	
}
