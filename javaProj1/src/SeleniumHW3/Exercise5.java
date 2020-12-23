package seleniumHW3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skyscanner.co.il/");
		// Fill the ‘From’ field with LHR
		driver.findElement(By.cssSelector("#fsc-origin-search")).sendKeys("LHR");
		Thread.sleep(2000);
		List<WebElement> listFrom = driver
				.findElements(By.cssSelector("#react-autowhatever-fsc-origin-search li span>span>strong"));
		for (WebElement el : listFrom) {
			if (el.getText().contains("LHR")) {
				el.click();
				break;
			}
		}

		Thread.sleep(2000);
		
		// Fill the ‘To’ field with FCO
		driver.findElement(By.cssSelector("#fsc-destination-search")).sendKeys("FCO");
		Thread.sleep(2000);
		List<WebElement> listTo = driver
				.findElements(By.cssSelector("#react-autowhatever-fsc-destination-search--item-0 span>span>strong"));
		for (WebElement el : listTo) {
			if (el.getText().contains("FCO")) {
				el.click();
				break;
			}
		}
		// Press the ‘Search Flights’ button
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}
