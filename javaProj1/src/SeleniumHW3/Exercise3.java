package seleniumHW3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.wix.com/jobs/locations/tel-aviv/positions");
		Thread.sleep(4000);
		
		Jobs jobs = new Jobs(driver);
		//call the method from the main
		jobs.printAllJobs("Engineer");
	}
	

}
