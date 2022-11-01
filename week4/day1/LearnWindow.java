package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> toWindowHandlesList = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(toWindowHandlesList.get(2));
		String title2 = driver.getTitle();
		System.out.println("Flight window title : "+title2);
		driver.close();
		
		driver.switchTo().window(toWindowHandlesList.get(1));
		String title = driver.getTitle();
		System.out.println("Train Window Title : "+title);
	}

}
