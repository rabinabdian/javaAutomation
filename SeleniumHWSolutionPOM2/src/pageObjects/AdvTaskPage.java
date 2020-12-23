package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdvTaskPage extends BasePage {
	
	@FindBy(css="[name='prio']")
	private WebElement prioritySelect;
	@FindBy(css="#duedate")
	private WebElement dateField;
	@FindBy(css="[name='task'].in500")
	private WebElement taskField;
	@FindBy(css="[name='note']")
	private WebElement noteField;
	@FindBy(css="#edittags")
	private WebElement tagsField;
	@FindBy(css="[value='Save']")
	private WebElement saveBtn;
	

	public AdvTaskPage(WebDriver driver) {
		super(driver);
	}

	public void fillForm(String priority, String date, String task, String note, String tags) {
		// Select
		Select s = new Select(prioritySelect);
		s.selectByValue(priority);
		fillText(dateField, date);
		fillText(taskField, task);
		fillText(noteField, note);
		fillText(tagsField, tags);
		click(saveBtn);
		sleep(2000);
	}

}
