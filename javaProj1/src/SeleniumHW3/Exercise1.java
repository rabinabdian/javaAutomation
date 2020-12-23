package seleniumHW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		//Fill in the User +Password + Remember me
		driver.findElement(By.cssSelector("#username")).sendKeys("Rotem");
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		driver.findElement(By.cssSelector("#rememberUn")).click();
		//click the login button
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(2000);
		//Get the error message and print it
		String errorLoginMsg = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println("Error login message : " + errorLoginMsg);
		//Click the ‘Forgot your password’ link
		driver.findElement(By.cssSelector("#forgot_password_link")).click();
		//Insert your name
		driver.findElement(By.cssSelector("#un")).sendKeys("Rotem");
		//Click on ‘Continue’ button
		driver.findElement(By.cssSelector("#continue")).click();
		Thread.sleep(2000);
		//Get the error message and print it
		String erroMsg = driver.findElement(By.cssSelector(".mb16.error")).getText();
		System.out.println("Error message : " + errorLoginMsg);
		// driver.quit();		
	}
}
