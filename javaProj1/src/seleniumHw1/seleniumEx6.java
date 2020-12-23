package seleniumHw1;

import javax.print.attribute.standard.PrinterInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.classfile.Annotation.element_value;

public class seleniumEx6 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Exercise 6: Navigate to https://www.selenium.dev/ Check if the title of this
		 * site is equal to “selenium web site” or contains “SeleniumHQ Browser
		 * Automation” (use getTitle()) and print yes/no
		 *  Navigate to 		 * https://www.google.com Check if the title of this site is equal to “Google”
		 * or contains “google” (use getTitle()) and print yes/no. Navigate back. Check
		 * again if the title of this site is equal to “selenium web site” or contains
		 * “SeleniumHQ Browser Automation” (use getTitle()) and print yes/no
		 * 
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
// Check if the title of this site is equal to “selenium web site” or contains “SeleniumHQ Browser Automation” (use getTitle()) and print yes/no
		String titlElement = driver.getTitle();
		if (titlElement.equalsIgnoreCase("selenium web site") || titlElement.toLowerCase().contains("seleniumhq")) {

			System.out.println("yes ---- selenium ");
		}

		
		
		// Navigate to 		 * https://www.google.com Check if the title of this site is equal to “Google”
		// * or contains “google” (use getTitle()) and print yes/no. Navigate back.
		 
		driver.get("https://www.google.com/");
		// Check if the title of this site is equal to “selenium web site” or contains “SeleniumHQ Browser Automation” (use getTitle()) and print yes/no
				String titlElementq = driver.getTitle();
				if (titlElementq.equalsIgnoreCase("google web site") || titlElementq.toLowerCase().contains("google")) {

					System.out.println("yes ---- google ");
					driver.navigate().back();
					System.out.println("driver.navigate().back() ");

				}
				
				titlElementq = driver.getTitle();
				
				if (titlElement.equalsIgnoreCase("selenium web site") || titlElement.toLowerCase().contains("seleniumhq")) {

					System.out.println("yes ---- selenium ");
				}
		
	}

}
