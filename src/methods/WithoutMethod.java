package methods;

public class WithoutMethod {

	public static void main(String[] args) {

		// Test Case 1: Validating the Home Page
		System.out.println("==============Test Case 1: Validating the Home Page==================");
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		System.out.println("Logout from application");
		System.out.println("Close the browser");

		// Test Case 2: Validating the Fund Transfer Page
		System.out.println("==============Test Case 2: Validating the Fund Transfer Page==================");
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		System.out.println("Logout from application");
		System.out.println("Close the browser");

		// Test Case 3: Validating the Login Page with Valid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Valid Credentials==================");
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		System.out.println("Logout from application");
		System.out.println("Close the browser");

		// Test Case 3: Validating the Login Page with Invalid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Invalid Credentials==================");
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
		System.out.println("Enter username as Invalid");
		System.out.println("Enter password as invalid123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		System.out.println("Logout from application");
		System.out.println("Close the browser");

		// Test Case 4: Validating the Account Balance Page and get the balance
		System.out.println(
				"==============Test Case 4: Validating the Account Balance Page and get the balance==================");
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url and launch application");
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		System.out.println(balance);
		System.out.println("Logout from application");
		System.out.println("Close the browser");

	}
}
