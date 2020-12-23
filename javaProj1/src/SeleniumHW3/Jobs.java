package seleniumHW3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jobs {

	WebDriver driver;

	public Jobs(WebDriver driver) {
		this.driver = driver;
	}

	//Add methods that printAllJobs that contains ‘Engineer’
	public void printAllJobs(String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".style-jozadwanchooseFileButton>a"));
		System.out.println("Links including ‘Engineer’ : ");
		for (WebElement el : list) {
			if (el.getText().contains(name)) {
				System.out.println(el.getText());
			}

		}
	}
}
