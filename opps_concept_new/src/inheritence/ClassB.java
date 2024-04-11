package inheritence;

public class ClassB extends ClassA {

	
	public void test4() {
		System.out.println("print result of test4");
	}
public static void main(String[] args) {
	ClassB b1 =new ClassB();
	b1.test4();
	b1.test1();
	b1.test2();
	b1.test3();

     ClassA a1=new ClassA();
          a1.test1();
          a1.test2();
          a1.test3();
}
}
