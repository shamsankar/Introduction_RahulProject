import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
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
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //After

	}

}
