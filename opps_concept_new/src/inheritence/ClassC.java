package inheritence;

public class ClassC extends ClassA  {
	
	public void test5() {
		System.out.println("print result of test5");
	}
	public void test6() {
		System.out.println("print result of test6");
	}

	/*
	 * Single and multiple inheritance is achived using simple java class but multi
	 * level , hyarici, hybrid inheritance is achives by interface
	 */
	  public static void main(String[] args) { 
		 ClassC c1 =new ClassC(); 
		  c1.test5();
	     c1.test6();
	     
	     
	  ClassA a1=new ClassA();
	  System.out.println(a1.x);
	  
	  }
	 
}
