package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Jeff");
		driver.findElement(By.xpath("//input[@value='Chennai']")).clear();
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		WebElement disabled = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		String isDisabled = disabled.getAttribute("aria-disabled");
		if(isDisabled.contains("true"))
			System.out.println("text box is disabled");
		else
			System.out.println("text box is NOT disabled");
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@value ='My learning is superb so far.']"));
		String attributeValue = findElement.getAttribute("value");
		System.out.println(attributeValue);
		
		WebElement elementEmailandTab = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		elementEmailandTab.sendKeys("jeff@gmail.com");
		elementEmailandTab.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Hello World");
		/*String attribute = "About yourself";
		String attributePlaceholder = elementAboutYourself.getAttribute("placeholder");
		if(attribute.equals(attributePlaceholder))
			System.out.println("control moved to next element");
		else 
			System.out.println("control NOT moved");
		*/
				
		

	}

}
