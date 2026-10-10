package methods;

public class CommonMethods {
	void launchBrowserAndApplication(){
		System.out.println("Launch the edge browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
	}
	
	void login(String username,String password){
		System.out.println("Enter username as "+username);
		System.out.println("Enter password as "+password);
		System.out.println("Click on Login button");
	}
	
//	void login(){
//		System.out.println("Enter username as Invalid");
//		System.out.println("Enter password as invalid123");
//		System.out.println("Click on Login button");
//	}
	
	void logoutAndCloseBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}
	
	 double getBalance(){
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;//local variable
		return balance;
	}

}
