package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement elementSignUp = driver.findElement(By.linkText("Create New Account"));
		elementSignUp.click();
		
		WebElement elementFirstName = driver.findElement(By.name("firstname"));
		elementFirstName.sendKeys("jeff");
		
		WebElement elementLastName = driver.findElement(By.name("lastname"));
		elementLastName.sendKeys("bezos");
	}

}
