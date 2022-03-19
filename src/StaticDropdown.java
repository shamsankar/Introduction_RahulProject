import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
			//dropdown with select tag - Static
		
		Select dropdown = new Select(staticDropdown);
		
			// 0 select/1 INR/2 AED/3 USD - 3rd index is USD
		dropdown.selectByIndex(3);
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
			// select the dropdown by Visible Text
		
		dropdown.selectByVisibleText("AED");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
			//Select by value - nothing but Value ="INR" attribute
		
		dropdown.selectByValue("INR");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
