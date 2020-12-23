package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		driver.findElement(By.cssSelector("#_nkw")).sendKeys("tent");
		WebElement searchBtn = driver.findElement(By.cssSelector(".btn.btn-prim"));
		searchBtn.click();
// get all titles and print them 

		List<WebElement> listOfTitlesElements = driver.findElements(By.cssSelector(".lvtitle>a"));

		for (WebElement webElement : listOfTitlesElements) {
			System.out.println(webElement.getText());

			/*
			 * 2-4 Person Instant Auto Up Camping Beach Outdoor Hiking Tent Teepee Shelter
			 * REI Co-op Quarter Dome 1 Tent - red hot Camping Tent Travel Backpacking Tent
			 * Outdoor Camping Sleeping Bag Tent Lightweig NEW LISTING Camping Camouflage
			 * Tent Outdoor Hiking Two Person Single Layer Ultralight Tent Snugpak
			 * Stratosphere - one person tent / bivy
			 */
		}

		// choose the third one from list
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println(listOfTitlesElements.get(2).getText());
		
		listOfTitlesElements.get(2).click(); // Camping Tent Travel Backpacking Tent Outdoor Camping Sleeping Bag Tent Lightweig
		
		
	}

}
