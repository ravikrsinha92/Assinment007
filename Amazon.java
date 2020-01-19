package assinment_mini;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon extends Flipkart{
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("--disable-notification");
		WebDriver driver= new ChromeDriver(chromeOptions);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone XR 64GB white");
		Thread.sleep(2000);
		Actions a= new Actions(driver);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();
		List<WebElement> products = driver.findElements(By.xpath("//span[@id='priceblock_ourprice']"));
		for(WebElement product:products) {
	        System.out.println(product.getText());      
	    }  

}}
