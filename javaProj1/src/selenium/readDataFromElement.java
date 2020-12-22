package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readDataFromElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://prd.canvusapps.com/signup");
		// automation site form example
		// https://prd.canvusapps.com/signup

		// about form fulfilled fields
		driver.findElement(By.id("user_name")).sendKeys("name");
		driver.findElement(By.cssSelector(".submit.btn.btn-primary")).click();


		String errMsg = driver.findElement(By.cssSelector(".alert.alert-error.alert-block.error")).getText();
		System.out.println(errMsg);
		// We couldn't set up that account, sorry. Please try again, or contact an admin (link is above).

	String name = 	driver.findElement(By.cssSelector("#user_name")).getAttribute("value");
	System.out.println(name);

//		driver.quit();

	}

}
