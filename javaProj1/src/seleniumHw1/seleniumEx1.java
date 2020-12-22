package seleniumHw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		// automation site form example
		// https://automation.co.il/tutorials/selenium/demo1/indexID.html

		// about form fulfilled fields
		driver.findElement(By.cssSelector("#forgot_password_link")).click();
//
//		get title 
		
		String titleString = driver.getTitle();
		if (titleString.toLowerCase().contains("forgot your password")) {
			System.out.println(titleString); // Forgot Your Password | Salesforce

		}
		
		driver.findElement(By.cssSelector("#un")).sendKeys("gal@gmail.com");

		driver.findElement(By.cssSelector("#continue")).click();

		String msg = 	driver.findElement(By.cssSelector("#forgotPassForm > div > p:nth-child(1)")).getText();

		System.out.println(msg); 
// #forgotPassForm > div > p:nth-child(1)
		
		
////		driver.quit();

		
		
		
		
		
	}

}
