package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementLink = driver.findElement(By.linkText("CRM/SFA"));
		elementLink.click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowHandlesToList1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(windowHandlesToList1.get(2));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		driver.switchTo().window(windowHandlesToList1.get(1));
				
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowHandlesToList2 = new ArrayList<String>(windowHandles2);
		
		driver.switchTo().window(windowHandlesToList2.get(2));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		
		driver.switchTo().window(windowHandlesToList2.get(1));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View Contact | opentaps CRM"))
			System.out.println("The title is Verified");
		else
			System.out.println("The Title doesnt match");
		
	
	}

}
