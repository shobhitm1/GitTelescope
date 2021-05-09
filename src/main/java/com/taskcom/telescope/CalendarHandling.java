package com.taskcom.telescope;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shobhit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.className("hasDatepicker")).click();
		WebDriverWait firstResult = new WebDriverWait(driver,5);
		firstResult.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		String current =driver.findElement(By.className("ui-datepicker-title")).getText();
		String currentmonth=current.split(" ")[0].trim();
		String currentyear=current.split(" ")[1].trim();
		while(!(currentmonth.equalsIgnoreCase("March") && currentyear.equals("2021"))) {
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
			String calendartitle =driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println("Month Value now : "+ calendartitle);
			currentmonth=calendartitle.split(" ")[0].trim();
		    currentyear=calendartitle.split(" ")[1].trim();
		}
		
		//driver.findElement(By.xpath("//a[contains(text,'23')")).click();
			WebElement date=driver.findElement(By.xpath("//td[@data-handler='selectDay']//child::a"));
			//datefirst.findElement(By.xpath("//[contains(text(),'23']))")).click();
			//date.click();
			//System.out.println(date.getText());
			WebElement datawidget=driver.findElement(By.className("ui-datepicker-calendar"));
			List<WebElement> columns=datawidget.findElements(By.tagName("td"));
			for(WebElement cell : columns) {
				if(cell.getText().equals("17")) {
					System.out.println("Element is 15");
					cell.click();
				}
			}
			List<WebElement> totallinks= driver.findElements(By.tagName("a"));
			System.out.println(totallinks.size());
			
	}

}
