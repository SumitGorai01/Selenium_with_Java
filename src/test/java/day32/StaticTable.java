package day32;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) find total no. of rows in a table
		int rows = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr")).size(); //multiple table se rows fetch 
		System.out.println("No. of rows = "+rows);
		
		int rows2 = driver.findElements(By.tagName("tr")).size(); // single table
		System.out.println("Total rows : "+rows2);
		
		// 2) find total no. of col. in a table
		int col = driver.findElements(By.tagName("th")).size(); //single table
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println("No. of cols = "+col);
		System.out.println("Total cols : "+cols);
		
		// 3) Read data from specific row and col
		String bookNameString = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookNameString);
		
		// 4) Read data from all the rows and cols
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value + "\t\t");

			}
		}
		
		
		// Print book name whose author is Mukesh
		for(int r=2;r<=rows;r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if (authorName.equals("Mukesh")) {
				String bookNameString1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookNameString1+"\t"+authorName);

			}

			
		}
		

	}

}
