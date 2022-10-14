package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodeSelenium {
	
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 //driver.close();
		 
		 /*firefox browser
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver ffdriver = new FirefoxDriver();
			ffdriver.get("http://leaftaps.com/opentaps/control/main");
			ffdriver.manage().window().maximize();
			ffdriver.close();
			 */

}
}
