package seleniumHw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.classfile.Annotation.element_value;

public class seleniumEx4 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Exercise 4: Choose a site (any site you want) Look for 3 elements with id and
		 * print the next information (The methods exist in each WebElement - find it
		 * and do . (dot) to expose the methods) the text (use getText() to get the
		 * text) the id name (use getAttribute(“id”)) the tag name (use getTagName()) is
		 * it displayed (use isDisplayed()) is it enabled (use isEnabled())
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/sch/ebayadvsearch");
		driver.findElement(By.cssSelector("#_nkw")).sendKeys("value input in nkw ");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.cssSelector("#_nkw"));
		String text = element.getText();
		String id = element.getAttribute("id");
		String tag = element.getTagName();
		boolean display = element.isDisplayed();
		boolean enabled = element.isEnabled();
		
		System.out.println(text + " , "+ id + " , "+ tag + " , "+ display + " , "+ enabled  );

	}

}
