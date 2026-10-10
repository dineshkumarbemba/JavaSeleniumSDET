package nonaccessmodifiers;

public abstract class Abstract1 {
public void method1() {
	System.out.println("Hey i am from method 1");
}
public int sum(int a , int b) {
	int c=a+b;
	System.out.println(c);
	return c;
}
abstract public void method11();
}
