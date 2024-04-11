package polymorphism;

public class ClassA {

	public static void main(String[] args) {
		ClassA a1 =new ClassA();
		a1.add(100, 200);
		a1.add(100, 200, 300);
		a1.add("raju", "shyam");
		a1.main("raju", "shrivastav");

	}
	public static void main(String x ,String y) {
		
	}
public int add(int x,int y) {
	return x+y;
	
}
     public String add(String x, String  y) {
    	 return x+y;
     }
     public int add(int x , int y , int z) {
		return x+ y + z;
    	 
     }
}
