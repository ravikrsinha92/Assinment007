package assinment_mini;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions chromeOptions= new ChromeOptions();
			chromeOptions.addArguments("--disable-notification");
			WebDriver driver= new ChromeDriver(chromeOptions);
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com");
			driver.findElement(By.xpath("(//button)[2]")).click();
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone XR 64GB");
			Thread.sleep(2000);
			Actions a= new Actions(driver);
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			a.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='_1Nyybr  _30XEf0']")).click();
			String x=driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']")).getText();
			Thread.sleep(2000);
			System.out.println(x);
		   
		   
				}
	}
