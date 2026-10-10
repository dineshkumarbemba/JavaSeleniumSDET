package interfac;

public class Implementation extends Parentinterface implements Int1,Int2  {

	@Override
	public void account() {
		System.out.println("Accounts page");
		
	}

	@Override
	public void addToCart() {
		System.out.println("Add to cart page");
		
	}

	@Override
	public void login() {
		System.out.println("Login page");
		
	}

	@Override
	public void homePage() {
		System.out.println("Home page");
		
	}

	@Override
	public void logout() {
		System.out.println("logoutpage");
		
	}
	
	public static void main(String[] args) {
		Implementation im = new Implementation();
		im.cityHouse();
		im.lands();
		im.account();
		im.addToCart();
		im.login();
		im.logout();
		im.homePage();
	}

}
