package inheritance;

public class Child extends Parent {
public void degree() {
	System.out.println("In this competitive world i have only my eng degree nothing there with me no job");
}
public static void main(String[] args) {
	Child c = new Child();
	c.degree();
	c.cityHouse();
	c.lands();
	c.farmLand();
	c.villageHouse();
}
}
