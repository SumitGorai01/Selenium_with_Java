package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//normal alert with ok button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
//		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
		
		//capture the text and accepts
//		Alert myAlert = driver.switchTo().alert();
//		System.out.println(myAlert.getText());
//		myAlert.accept();
		
		
		//Confirmation alert - ok & cancel
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		// prompt alert -input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Thread.sleep(5000);
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("Welcome");
		myAlert.accept();	
		

	}

}
