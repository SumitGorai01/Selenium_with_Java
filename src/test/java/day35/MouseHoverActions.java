package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktop']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

		Actions actions = new Actions(driver);
		
		//mouse hover
		actions.moveToElement(desktop).moveToElement(mac).build().perform();
		
		actions.moveToElement(desktop).moveToElement(mac).perform();
		
	}
}
