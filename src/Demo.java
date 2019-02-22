import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium test code
		
		//Create a driver object
		
		//Chrome Webdriver object
		
		// Class Chrome
		// invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("http://au.yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.findElement(By.id("email")).sendKeys("Sada");
		//driver.close(); //close browser
		//driver.quit(); // close all browser opened by ssenelenium
		
	
	}
	
	
	
}
