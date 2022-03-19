import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelfIntroduction {

	public static void main(String[] args) {
	    //Invoking Browser
		//Chrome - ChromeDriver --> Methods
		//ChromeDriver.exe --> ChromeBrowser
		//driver=object & new = operater/memory allocator
		//webdriver.chorme.driver
		
		System.setProperty("webdriver.chrome.driver","E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//System.setProperty("webdriver.gecko.driver","E:\\Shiyamala_Java_Selenium_Learn\\GeckoDriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //Close the current Window --> Single Window
		driver.quit(); // Close all the Associated Windows --> Multiple Window
	}

}
