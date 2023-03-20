package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Max {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Max\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions a=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement drag1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement drag3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement drag4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		a.dragAndDrop(drag, drop).perform();
		a.dragAndDrop(drag1, drop2).perform();
		a.dragAndDrop(drag3, drop3).perform();
		a.dragAndDrop(drag4, drop4).perform();
		
		
			
		
	}

}
