package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvTaskPage extends BasePage {

	public AdvTaskPage(WebDriver driver) {
		super(driver);
	}

	public void fillForm(String priority, String date, String task, String note, String tags) {
		Select 	s= new Select(driver.findElement(By.cssSelector("[name='prio']")));
		s.selectByValue(priority);	
		fillText(driver.findElement(By.cssSelector("#duedate")),date );
		fillText(driver.findElement(By.cssSelector("[name='task'].in500")),task );
		fillText(driver.findElement(By.cssSelector("[name='note'].in500")),note );
		fillText(driver.findElement(By.cssSelector("#edittags")),tags );
		click(driver.findElement(By.cssSelector("[value='Save']")));
		sleep(1000);
	}
	
	
	


}
