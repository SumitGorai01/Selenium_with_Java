package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement btnElement = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action = new Actions(driver);
		
		//right click action
		action.contextClick(btnElement).perform();
		
		//click on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		Thread.sleep(5000);
		
		//close alert box
		driver.switchTo().alert().accept();

		

	}

}
