package methods;

public class WithMethods {
public static void main(String[] args) {
	CommonMethods cm  = new CommonMethods();

	// Test Case 1: Validating the Home Page
	System.out.println("==============Test Case 1: Validating the Home Page==================");
	cm.launchBrowserAndApplication();
	cm.login("Bharath", "bharath123");
	System.out.println("Execute Test Case 1 Steps Related to HomePage....");
	cm.logoutAndCloseBrowser();

	// Test Case 2: Validating the Fund Transfer Page
	System.out.println("==============Test Case 2: Validating the Fund Transfer Page==================");
	cm.launchBrowserAndApplication();
	cm.login("Bharath", "bharath123");
	System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
	cm.logoutAndCloseBrowser();

	// Test Case 3: Validating the Login Page with Valid Credentials
	System.out.println(
			"==============Test Case 3: Validating the Login Page with Valid Credentials==================");
	cm.launchBrowserAndApplication();
	cm.login("Bharath", "bharath123");
	System.out.println("Execute Test Case 3 Steps Related to Login Page....");
	cm.logoutAndCloseBrowser();

	// Test Case 3: Validating the Login Page with Invalid Credentials
	System.out.println(
			"==============Test Case 3: Validating the Login Page with Invalid Credentials==================");
	cm.launchBrowserAndApplication();
	cm.login("Invalid", "invalid123");
	System.out.println("Execute Test Case 3 Steps Related to Login Page....");
	cm.logoutAndCloseBrowser();

	// Test Case 4: Validating the Account Balance Page and get the balance
	System.out.println(
			"==============Test Case 4: Validating the Account Balance Page and get the balance==================");
	cm.launchBrowserAndApplication();
	cm.login("Bharath", "bharath123");
	System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
	cm.getBalance();
	System.out.println(cm.getBalance());
	cm.logoutAndCloseBrowser();

}
}
