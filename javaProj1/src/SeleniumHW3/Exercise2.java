package seleniumHW3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.wix.com/jobs/locations/tel-aviv/positions");
		Thread.sleep(4000);

		// Get list of all jobs
		List<WebElement> list = driver.findElements(By.cssSelector(".style-jozadwanchooseFileButton>a"));
		// Print list
		System.out.println("All the links in the page: ");
		for (WebElement el : list) {
			System.out.println(el.getText());
		}

		// Search for the word 'Engineer' in the list of jobs
		System.out.println("Links including Engineer : ");
		for (WebElement el : list) {
			if (el.getText().contains("Engineer")) {
				System.out.println(el.getText());
			}
		}
		// driver.quit();
	}

}
