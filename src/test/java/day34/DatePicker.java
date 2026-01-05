package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	static void selectFutureDate(WebDriver driver, String year, String month, String date) {

		while (true) {
			String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//			 String currDate = driver.findElement(By.xpath("//span[@class='ui-datepicker-date']")).getText();

			if (currMonth.equals(month) && currYear.equals(year)) {
				System.out.println("Date selected..");
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	}

	static void selectPastDate(WebDriver driver, String year, String month, String date) {

		while (true) {
			String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//			String currDate = driver.findElement(By.xpath("//span[@class='ui-datepicker-date']")).getText();

			if (currMonth.equals(month) && currYear.equals(year)) {
				System.out.println("Date selected..");
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// switch to frame
		driver.switchTo().frame(0);

		// 1. using sendkeys
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025");

		// 2. using date picker
		String year = "2025";
		String month = "March";
		String date = "24";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

//		selectFutureDate(driver, year, month, date);
		selectPastDate(driver, year, month, date);

	}

}
