import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Shiyamala_Java_Selenium_Learn\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); //id Loacator
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");//Name
		
		driver.findElement(By.className("signInBtn")).click();//Class Name
	
		//css Selector Tagname.ClassName --> p.error
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // Error message will Print
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //Link text
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jas"); // XPath
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jas@abc.com"); //CssSelector
	
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");//or follo below
		
		//driver.findElement(By.cssSelector("//input[@type='text'];nth-child(3)")).sendKeys("john@gmail.com");
		// travel from Parent to Child through Xpath
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7406123450");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(1000);
		
		// travel from Parent to Child through CssSelector
		
	System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //or below Step
		//System.out.println(driver.findElement(By.xpath("//form/p")).getText());
	//Enter Correct User Name and PWD
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); //from id Loacator to change css Locator
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //0r
	
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//input[contains(@class,'submit')]")).click();
	

	}

}
