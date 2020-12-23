package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.TasksPage;


public class SearchTaskTest extends BaseTest {

	@Test
	public void tc01_searchTest() {
		TasksPage tp = new TasksPage(driver);
		tp.addSimpleTask("simple5");
		tp.search("simple5");
		boolean result = tp.isTaskExist("simple5");
		System.out.println(result);
		// should check that we succeed to add and search task
		Assert.assertTrue(result);
		
	}

}
	



