package inheritance;

public class Parent extends GrandParent{
	public void cityHouse() {
	System.out.println("With earnings in my govt job i have house in city");

}
	public void lands() {
		System.out.println("With my hardworks i am having some lands in city area as well little outer to city");
	}
	@Override
	public void villageHouse() {
		// TODO Auto-generated method stub
		super.villageHouse();
	}
	@Override
	public void farmLand() {
		// TODO Auto-generated method stub
		super.farmLand();
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.cityHouse();
		p.lands();
		p.farmLand();
		p.villageHouse();
	}
}
