package WebDriverProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		UserName.sendKeys("xyz@abc.com");
		Password.sendKeys("Abc@12345");
		
		LoginBtn.click();

	}

}
