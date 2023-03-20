package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\Max\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Actions a=new Actions(driver);
		WebElement more = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(more).perform();
		Thread.sleep(2000);
		WebElement titan = driver.findElement(By.xpath("//a[text()='Tiitan']"));
		a.moveToElement(titan).perform();
		a.click().perform();		
	}

}
