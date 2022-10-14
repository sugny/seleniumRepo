package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement elementClick = driver.findElement(By.xpath("//span[text()='Click']"));
		elementClick.click();
		
		String title = driver.getTitle();
	
		if(title.contains("Dashboard"))
			System.out.println("The title of the page is confirmed");
		else
			System.out.println("The title of the page is Not confirmed");
		
		driver.navigate().back();
		
		boolean elementDisabledButton = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();		
		if(elementDisabledButton==false)
			System.out.println("button is enabled");
		else 
			System.out.println("button is disabled");
		
		WebElement elementPositionButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
		System.out.println("The position of the button is "+elementPositionButton.getLocation());
		
		WebElement elementSave = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
		String colorValue = elementSave.getCssValue("color");
		System.out.println("The Color of the save button is : "+colorValue);

		WebElement elementHeightnWidth = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
		Dimension heightnWidth = elementHeightnWidth.getSize();
		System.out.println("The Height and Width of the submit buttion is : "+heightnWidth);
		
		WebElement elementSucessButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		String cssValue1 = elementSucessButton.getCssValue("background-color");
		System.out.println(cssValue1);
		// have doubt
		
		
		
	}

}
