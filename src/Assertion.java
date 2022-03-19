import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected();
		
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		//Assert True
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		// get number of check box present on Web page - Common Locator need to find for all the Checkboxes
		
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		/*int i=1;  //initialization
		
		while(i<5)//Comparision - it will stop when it will fail
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //2 adults select
			i++; // Condition
		} */
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // Before
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); 
	                               
		}
	
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//assert equals to compare the selenium returns and expected results
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //After
	}

}
