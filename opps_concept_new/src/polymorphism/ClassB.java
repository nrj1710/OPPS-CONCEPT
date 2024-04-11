package polymorphism;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		ClassB  b1 =new ClassB();
		b1.add(100,200);

	}
	public int add (int x,int y) {
		System.out.println("child class add method");
		return x+y;
	}

}
