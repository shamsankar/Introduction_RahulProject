import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//input[@class='inputs ui-autocomplete-input valid']"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"));
			
			break;
		}
		
		
		

	}

}
