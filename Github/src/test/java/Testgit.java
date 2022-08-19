import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testgit {
	
	static WebDriver driver;
	
	@Test
	
	public void openBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\Latest driver\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");		
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("clover");
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).build().perform();
		List<WebElement> results=driver.findElements(By.xpath("//div[@class='v7W49e']//cite[contains(@class,'iUh30')]"));
		System.out.println(results.size());
	}

}
