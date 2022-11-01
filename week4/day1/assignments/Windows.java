package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandlesSet1 = driver.getWindowHandles();
		List<String> windowHandlesList1 = new ArrayList<String>(windowHandlesSet1);
		driver.switchTo().window(windowHandlesList1.get(2));
		
		String title = driver.getTitle();
		System.out.println("First Child Window : "+title);
		
		if(title.contains("Dashboard"))
			System.out.println("New Window is Verified");
		else
			System.out.println("Not Verified");
		
		//Find the number of opened tabs
		driver.switchTo().window(windowHandlesList1.get(1));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandlesSet2 = driver.getWindowHandles();
		List<String> windowHandlesList2 = new ArrayList<String>(windowHandlesSet2);
		System.out.println("The number of opened tabs :"+windowHandlesList2.size());
		
		//Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		System.out.println("Parent Window Title :" +driver.getTitle());
		
		 /*getWindowHandle - will always have the parent window
		 	String windowHandle = driver.getWindowHandle();
		*/
		for (String childWindowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(childWindowHandle);
		 if (driver.getTitle().equals("Window")){
			 // System.out.println("Parent Window");
		    }
		 else 
			 driver.close();
		}
		
		// Using same list 
		windowHandlesList2.clear();
		Set<String> windowHandlesSet3 = driver.getWindowHandles();		
		windowHandlesList2.addAll(windowHandlesSet3);		
		driver.switchTo().window(windowHandlesList2.get(0));
		
		//Wait for 2 new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		
		/* Explicit Wait 
		 * 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Open with delay']"))).click();
		 */	
		
		}


}
