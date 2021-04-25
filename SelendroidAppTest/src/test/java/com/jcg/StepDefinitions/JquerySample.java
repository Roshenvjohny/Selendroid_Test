package com.jcg.StepDefinitions;

//import java.awt.List;

import java.io.File;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.time.LocalDateTime;

import java.util.Date;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedCondition;

import org.openqa.selenium.support.ui.ExpectedConditions;

//import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

//import com.excel.utility.Xls_Reader;

import com.google.common.io.Files;

public class JquerySample {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C://SELENIUM//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		// selecting the selectable link from jqueryui page

		driver.findElement(By.xpath("//a[contains(@href,'https://jqueryui.com/selectable/')]")).click();

		driver.switchTo().frame(0);

		// keepig all the selectable options inside the list.

		List<WebElement> list = driver.findElements(By.cssSelector("ol#selectable *"));

		Actions act = new Actions(driver);

		// performing the selection of holding the mouse and select the items/elements
		// from thr list without releasing the mouse. on selection of element 7 , the
		// mouse is released.

		act.clickAndHold(list.get(1)).clickAndHold(list.get(3)).clickAndHold(list.get(7)).release().build().perform();

		driver.findElement(By.xpath("//a[contains(@href,'https://jqueryui.com/controlgroup/')]")).click();

		Select car = new Select(driver.findElement(By.id("car-type-button")));

		car.selectByVisibleText("SUV");

		driver.findElement(By.xpath("//input[@id=\"transmission-automatic\"]")).click();

		driver.findElement(By.xpath("//input[@id='insurance']")).click();

		Select car2 = new Select(driver.findElement(By.id("transmission-standard-v")));

		car.selectByVisibleText("Trunk");

		driver.findElement(By.xpath("//input[@id=\"transmission-automatic\"]")).click();

		driver.findElement(By.xpath("//input[@id='insurance']")).click();

		driver.close();

	}

}
