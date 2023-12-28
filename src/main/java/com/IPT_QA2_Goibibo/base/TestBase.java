package com.IPT_QA2_Goibibo.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public abstract class TestBase {
	public static JavascriptExecutor js;
	public static WebDriverWait wait;
	public static WebDriver driver;
	public static Robot rbt;
	public static Actions act;
	public static WebDriver launchBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")
				) {
			
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{

			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
	}
	

	public static void staticWait(long sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public static void inputValues(WebElement element,String value) {
		element.sendKeys(value);
	}

	public static void clickOnWebelement(WebElement element) {
		element.click();	
	}

	public static void getAText(WebElement element) {

		System.out.println(element.getText());
	}

	public static void dropDown(WebElement element,String order,String value) {

		Select sel = new Select(element);
		if (order.equalsIgnoreCase("text")) {
			sel.selectByVisibleText(value);
		}else if (order.equalsIgnoreCase("value")) {
			sel.selectByValue(value);
		}else if (order.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			sel.selectByIndex(parseInt);
		}



	}
	public static void screenShot(String name) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\learn\\eclipse-workspace\\TestNG\\screenshot\\"+name+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickOnElement(WebElement element) {
		element.click();

	}
	public void frame(int index) {

		driver.switchTo().frame(index);	
	}
	public void scanner(WebElement element) {
		Scanner ref  = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = ref.next();	
		element.sendKeys(email);
		ref.close();
	}
	public void clickMouse(WebElement element) {
		act.click(element).perform();		
	}
	public void explicityWait(WebElement element) {
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(element)).click();;		
	}

	public static List<WebElement> getOptions(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		return options;
	}

	public static void exit() {
		driver.quit();
	}

	public void windowHandling(String name) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(driver.switchTo().window(string).getTitle().equals(name)) {
				break;
			}
		}

	}


	public static void keyboardControl(String value) {
		try {
			rbt = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (value.equalsIgnoreCase("enter")) {
			rbt.keyPress(KeyEvent.VK_ENTER);
		}else if (value.equalsIgnoreCase("down")) {
			rbt.keyPress(KeyEvent.VK_DOWN);
		}

	}

	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
	}

	public static void windowHandles(String value) {
		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> iterator = windowHandles.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			if(driver.switchTo().window(next).getTitle().contains(value)) {
				driver.close();
			}
		}

	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	public static String getCurrentTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static  void javaScript(String value) {
		if(value.equalsIgnoreCase("down")) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500);");
		}else if (value.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(0,-3000);");
		}
	}

	public static void explicityWaitAlert(long seconds,String value) {
	//	wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		if (value.equalsIgnoreCase("alert accept")) {
			wait.until(ExpectedConditions.alertIsPresent()).accept();
		}else if (value.equalsIgnoreCase("alert dismiss")) {
			wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		}
	}

	public static void explicityWaitWebelement(WebElement element,long seconds,String value) {


		//wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		if (value.equalsIgnoreCase("Singlevisibility")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}else if (value.equalsIgnoreCase("allvisibility")) {
			wait.until(ExpectedConditions.visibilityOfAllElements(element));

		}else if (value.equalsIgnoreCase("clickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();;
		}

	}
	public static void moveToElement(WebElement element) {
		act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void sleep(long sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
