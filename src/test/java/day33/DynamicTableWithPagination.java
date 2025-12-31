package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableWithPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
		
		
		//close if pop-up is shown
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//button[@class='parent']")).click();
		
		// showing 1 to 10 of 19081(1909 Pages)
		
		String textString = driver.findElement(By.xpath("//div[contains(text(),'Pages']")).getText();
		
		int total_pages = Integer.parseInt(textString.substring(textString.indexOf("(")+1,textString.indexOf("Pages")-1));
		
		//repeating pages
		for(int p=1;p<=5;p++) {
			if (p>1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@class=''Pagination]//*[text()="+p+"]"));
				active_page.click();
			}
		}
		
		//reading data from the pages
		int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for(int r=1;r<=noOfRows;r++) {
			String customerNameString = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
			System.out.println(customerNameString);
		}
		
		

	}

}
