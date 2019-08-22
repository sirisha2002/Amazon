package org.cts.Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonChild extends Amazon {
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Janakiram\\eclipse-workspace\\Amazon\\driver\\chromedriver5.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		WebElement src=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		src.sendKeys(data(1,3));
		
		
		WebElement clk=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		clk.click();
		
		WebElement phone=driver.findElement(By.xpath("//span[text()='Apple iPhone 8 Plus (256GB) - Silver']"));
		phone.click();
		
		WebElement buy=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buy.click();
		
	}

}
