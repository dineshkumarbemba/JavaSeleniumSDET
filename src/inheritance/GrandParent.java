package inheritance;

public class GrandParent {
	public void villageHouse() {
	System.out.println("Village House of 2000sq feet with full of lands");
}
	public void farmLand() {
	System.out.println("Village having 10acres of agriculture lands");
}
public static void main(String[] args) {
	GrandParent gp= new GrandParent();
	gp.villageHouse();
	gp.farmLand();
}
}
