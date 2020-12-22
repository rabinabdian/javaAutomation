package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementByCssSelector {

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
		driver.findElement(By.cssSelector("#firstname")).sendKeys("name");

		
		driver.findElement(By.cssSelector("#lastname")).sendKeys("name");

		
		driver.findElement(By.cssSelector("#email")).sendKeys("email@email.com");

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#next")).click();

		// choose level form
		driver.findElement(By.cssSelector(".fa.fa-star")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".btn.btn-next.btn-fill.btn-warning.btn-wd.btn-sm")).click();
//
//// address form 
		driver.findElement(By.cssSelector("#streetname")).sendKeys("street");
		driver.findElement(By.cssSelector("#streetname")).clear(); // clear field before entering text
		driver.findElement(By.cssSelector("#streetnumber")).sendKeys("26");
		driver.findElement(By.cssSelector("#city")).sendKeys("NY");
////		driver.findElement(By.id("country")).click();
////
////		driver.findElements(By.id("country")).get(2).click();
		Thread.sleep(2000);

		// using attribute 
		driver.findElement(By.cssSelector("[name='finish']")).click();
		Thread.sleep(2000);
		driver.quit();

		
		
		
		
		
	}

}
