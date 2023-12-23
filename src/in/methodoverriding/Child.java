package in.methodoverriding;

public class Child extends Parent {
	
	public int m2() {
		System.out.println("Child m2");
		return 1;
	}
	
	public  int m1() {
		System.out.println("Child m1");
		return 1;
	}
	
	

//	@Override
//	public void m3() {
//		System.out.println("m3 method");
//		
//	}
	
public static void main( String [] args) {
		Parent pp = new Parent();
		pp.m1();
		
		Child cc = new Child();
		cc.m2();
		
		Parent p3 = new Child();
		p3.m1();
	}

}
