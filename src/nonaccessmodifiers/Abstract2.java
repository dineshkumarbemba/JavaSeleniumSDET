package nonaccessmodifiers;

public class Abstract2 extends Abstract1 {

	public void method11() {
		System.out.println("Method11 implementation.");
		
	}
	
	public static void main(String[] args) {
		Abstract2 a = new Abstract2();
		a.method1();
		a.sum(10, 11);
		a.method11();
	}

}
