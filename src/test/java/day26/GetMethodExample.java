package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String title = driver.getTitle();
		System.out.println(title);

		String currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);

		String pageSourceString = driver.getPageSource();
		System.out.println(pageSourceString);

		String windowId = driver.getWindowHandle();
		System.out.println("Window id = " + windowId);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> idsString = driver.getWindowHandles();
		System.out.println(idsString);
	}
}
