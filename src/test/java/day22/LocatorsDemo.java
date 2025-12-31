package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");
		// for maximizing the window
		driver.manage().window().maximize();

		// name locators
//		driver.findElement(By.name("search")).sendKeys("Mac");

		// id locators
//		boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
//		System.out.println(logoDisplayStatus);

		// linkText and partialLinkText
//		driver.findElement(By.linkText("Tablets")).click();
//		driver.findElement(By.partialLinkText("Tab")).click(); // pass only some parts of the text

		/* 
		 * The difference between linkText and partialLinkText is that linkText accepts
		 * full text while partialLinkText accepts only some part of the targeted text
		 * But LinkText is preferred.
		 */
		
		//class locators - to capture links of header
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline"));
		System.out.println("Total no. of links in header : "+headerLinks.size());
		
		//tagName
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("All a tags = "+allLinks.size());
		
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println("All images = "+allImages.size());
//		driver.close();
	}
}
