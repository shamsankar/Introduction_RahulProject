import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// (//a[@value='MAA'])[2] - Xpath for Chennai
		//   //a[@value='BLR'] - BLR
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		
		driver.findElement(By.xpath("//select[@value='BLR']")).click();
		
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
	}

}
