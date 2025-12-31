package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Assignment
 * ----------
 * Open application "https://www.demoblaze.com/index.html"
 * 1) Total number of links & print them
 * 2) Total number of images
 * 3) Click on Any product link using linkText/partialLinkText
 * 
 */
public class LocatorAssignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : "+links.size());
		
		List<WebElement> allImages  = driver.findElements(By.tagName("img"));
		System.out.println("Total images : "+allImages.size());
		
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.partialLinkText("Lo")).click();
		
	}
}
