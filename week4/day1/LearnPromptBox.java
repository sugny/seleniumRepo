package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPromptBox {

	public static void main(String[] args) {
			
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("cts");
		alert.accept();
		
	}

}
