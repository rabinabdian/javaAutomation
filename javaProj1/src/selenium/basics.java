package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");
		// automation site form example
		// https://automation.co.il/tutorials/selenium/demo1/indexID.html

		// about form fulfilled fields
		driver.findElement(By.id("firstname")).sendKeys("name");
		driver.findElement(By.id("lastname")).sendKeys("last");
		driver.findElement(By.id("email")).sendKeys("email@email.com");
		Thread.sleep(2000);
		driver.findElement(By.id("next")).click();

		// choose level form
		driver.findElement(By.id("Advanced")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("next")).click();

// address form 
		driver.findElement(By.id("streetname")).clear(); // clear field before entering text
		driver.findElement(By.id("streetname")).sendKeys("street");
		driver.findElement(By.id("streetnumber")).sendKeys("26");
		driver.findElement(By.id("city")).sendKeys("NY");
//		driver.findElement(By.id("country")).click();
//
//		driver.findElements(By.id("country")).get(2).click();
		Thread.sleep(2000);

		driver.findElement(By.id("finish")).click();

	}

}
