package sample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCheatSheet {
	
	public void selenium() throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Navigate to url :
			driver.get(null);
			driver.navigate().to("");
			//Refresh page :
			driver.navigate().refresh();
			//Navigate forwards in browser history :
			driver.navigate().forward();
			//Navigate backward in browser history :
			driver.navigate().back();

		
		driver.get("www.google.com");
		
		// Find Element
		WebElement eleId = driver.findElement(By.id("username"));
		
		/*
		 * By.id() By.name() By.linkText() By.partialLinkText() By.tagName()
		 * By.className() By.xPath() By.cssSelector()
		 */
		
		//Find Elements ----> Returns List ----> eg : radio button, drop down 
		List<WebElement> findElements = driver.findElements(By.id("text"));
		
		
		//DROP DOWN
		
		Select dropDown = new Select (driver.findElement(By.id("username")));
		
		dropDown.selectByIndex(0);
		dropDown.selectByVisibleText("yes");
		dropDown.selectByValue("ok");
		
		//ELEMENT VALIDATION ------> Returns boolean value
		eleId.isEnabled();
		eleId.isDisplayed();
		eleId.isSelected();
		
		//HANDLE ALERTS
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("accept");
		
		//Get Methods ----> all return type are String
		
		String title = driver.getTitle();
			
		driver.getCurrentUrl();
		//to retrieve the current page source of the webpage
		driver.getPageSource();
			
		eleId.getText();
		//to retrieve the value specified in the attribute
		eleId.getAttribute("id");
		
		// Frames -----> all return type are WebDriver
		
		WebDriver frame = driver.switchTo().frame(1);
		driver.switchTo().frame("frameNameOrID");
		driver.switchTo().frame(eleId);
		driver.switchTo().defaultContent(); //Return driver focused on the top window/first frame.
		driver.switchTo().parentFrame(); // Return  driver focused on the parent frame

		
		// WINDOW HANDLING 
		
		String windowHandle = driver.getWindowHandle(); //String is a return type
		Set<String> windowHandles = driver.getWindowHandles(); // Returns Set<String>
		WebDriver window = driver.switchTo().window(windowHandle);
		driver.close();
		driver.quit();
		
		// Mouse Actions & Keyboard Methods ref testLeaf PDF
		
		//IMPLICIT WAIT u kn check line 25
		
		//Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(eleId));
		
		// ScreenShot
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshot/amazon.png");
		FileUtils.copyFile(source, target);
		
		
	}

}
