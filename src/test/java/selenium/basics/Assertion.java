package selenium.basics;

import org.testng.Assert;

public class Assertion {
public static void main(String[] args) {
	Assert.assertEquals(10,10,"Values are matched");
	System.out.println("Execution Completed");
	Assert.assertNotEquals(10, 120,"Asserts should not match but here matching");
	Assert.assertTrue(5<10,"Yes 5 is lesser than 10");
	Assert.assertFalse(10>20,"yeah 10 is not greater than 20 assert false");
}
}
