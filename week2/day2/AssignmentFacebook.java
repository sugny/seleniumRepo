package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement elementSignUp = driver.findElement(By.linkText("Create New Account"));
		elementSignUp.click();
		
		WebElement elementFirstName = driver.findElement(By.name("firstname"));
		elementFirstName.sendKeys("jeff");
		
		WebElement elementLastName = driver.findElement(By.name("lastname"));
		elementLastName.sendKeys("bezos");
		
		WebElement elementMobileOrEmail = driver.findElement(By.name("reg_email__"));
		elementMobileOrEmail.sendKeys("1234567890");
		
		WebElement elementPasswordSetup = driver.findElement(By.id("password_step_input"));
		elementPasswordSetup.sendKeys("9876543210");
		
		WebElement elementDay = driver.findElement(By.id("day"));
		Select day = new Select(elementDay);
		day.selectByVisibleText("9");
		
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select month = new Select(elementMonth);
		month.selectByVisibleText("Dec");
		
		WebElement elementYear = driver.findElement(By.id("year"));
		Select year = new Select(elementYear);
		year.selectByVisibleText("1992");
		
		WebElement elementGender = driver.findElement(By.name("sex"));
		elementGender.click();
		
	}
}
