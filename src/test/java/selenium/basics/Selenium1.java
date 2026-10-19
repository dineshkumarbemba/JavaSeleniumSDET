package selenium.basics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium1 {
public static void main(String [] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().deleteAllCookies();
	@Nullable
	String title = driver.getTitle();
	String actualTitle="Google";
	Assert.assertEquals(title,actualTitle,"FAILED: Title mismatch!");
    driver.navigate().to("https://www.selenium.dev/");
    String seleniumTitle="Selenium";
    @Nullable
	String title2 = driver.getTitle();
    Assert.assertEquals(title2, seleniumTitle,"FAILED: Title Mismatch!..");
    driver.navigate().back();
    driver.navigate().refresh();
    driver.navigate().forward();

    
	String windowHandle = driver.getWindowHandle();
	System.out.println("Current window id is : "+windowHandle);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://drive.google.com/file/d/1NK0C1YoI25Gm1BMAY5KqGIw73uAlHQ1m/view");
	driver.switchTo().window(windowHandle);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
	driver.switchTo().window(windowHandle);
	@Nullable
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	int height = driver.manage().window().getSize().getHeight();
	int width = driver.manage().window().getSize().getWidth();
	System.out.println("Height is : "+height +"Width is :"+width);
	
	driver.close();
	//driver.quit();
}
}
