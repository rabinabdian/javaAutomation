package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.TasksPage;


public class ListTest extends BaseTest{
	
	@Test
	public void tc01_addlistTest() {
		TasksPage tp = new TasksPage(driver);
		tp.addList("Gal1234");
		boolean result = tp.isListExist("Gal1234");
		System.out.println(result);
		// should check that we add list 
		Assert.assertTrue(result);
	}
	
	@Test
	public void tc02_chooseListTest() {
		TasksPage tp = new TasksPage(driver);
		//tp.addList("Gal1234");  
		tp.chooseList("Gal1234");
		tp.addSimpleTask("Task1111");
		boolean result = tp.isTaskExist("Task1111");
		System.out.println(result);
		// should check that we add the task in the list
		Assert.assertTrue(result);
	}
	
	
	
}


