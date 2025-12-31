package day28;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Assignment-
 * 
 * https://testautomationpractice.blogspot.com/
 * 
 * 1) provide some string search for it 
 * 2) count number of links 
 * 3) click on each link using for loop 
 * 4) get window ID's for every browser window 
 * 5) close specific browser window
 */
public class AssignmentSolution {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	   	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
	   	driver.findElement(By.xpath("//input[@type='submit']")).click();
	   	
	   	List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
	   	System.out.println("Total Searched Link = "+links.size());
	   	
	   	for(WebElement link:links) {
	   		System.out.println("Clicking on link : "+link.getText());
	   		link.click();
	   	}
	   	
	   	Set<String> windowIds = driver.getWindowHandles();
	   	String parentWindow = driver.getWindowHandle();
	   	
	   	int i=1;
	   	for (String winId : windowIds) {
	   		driver.switchTo().window(winId);
			System.out.println(i+"st Window id = "+winId);
			System.out.println("Title : "+driver.getTitle());
			i++;
			
			if (driver.getTitle().contains("Java") && !winId.equals(parentWindow)) {
				driver.close();
				
			}
		}
	   	driver.switchTo().window(parentWindow);
	   	
	   	driver.close();
	   	
	   	
	}
}
