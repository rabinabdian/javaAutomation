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
		if (siteTitleCheck(driver,"selenium web site","seleniumhq")) {

			System.out.println("yes ---- selenium ");
		}

		
		
		// Navigate to 		 * https://www.google.com Check if the title of this site is equal to “Google”
		// * or contains “google” (use getTitle()) and print yes/no. Navigate back.
		 
		driver.get("https://www.google.com/");
		// Check if the title of this site is equal to “selenium web site” or contains “SeleniumHQ Browser Automation” (use getTitle()) and print yes/no
			
				if (siteTitleCheck(driver,"google web site","google")) {

					System.out.println("yes ---- google ");
					driver.navigate().back();
					System.out.println("driver.navigate().back() ");

				}
				
			
				
				if (siteTitleCheck(driver,"selenium web site","seleniumhq")) {

					System.out.println("yes ---- selenium ");
				}
		
	}

	/**
	 * @param driver 
	 * @param titlElementq
	 * @param string 
	 * @return
	 */
	public static boolean siteTitleCheck(WebDriver driver, String equal, String contains) {
		String titlElementq = driver.getTitle();
		
		if (titlElementq.equalsIgnoreCase(equal) || titlElementq.toLowerCase().contains(contains)) {
			return true;
		} 
		return false;
	}

}
