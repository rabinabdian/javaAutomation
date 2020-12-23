package tests;

import pageObjects.AdvTaskPage;
import pageObjects.TasksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedTasksTest extends BaseTest {
	
	@Test
	public void tc01_addAdvancedTaskTest() throws InterruptedException {
		TasksPage tp = new TasksPage(driver);
		int before = tp.getNumTasks();
		System.out.println("before = " + before);
		tp.openAdvTask();
		AdvTaskPage atp = new AdvTaskPage(driver);
		atp.fillForm("1", "11/10/20", "MyAdvancedTask1", "MyNote1", "MyTag1");
		tp = new TasksPage(driver);
		tp.openAdvTask();
		atp.fillForm("2", "22/10/20", "MyAdvancedTask2", "MyNote2", "MyTag2");
		Thread.sleep(2000);
		int actual = tp.getNumTasks();
		System.out.println("actual = " + actual);
		// should check that we succeed to add 2 tasks
		Assert.assertEquals(actual, before + 2);
	}
}


