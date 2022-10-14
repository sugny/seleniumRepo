package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementLink = driver.findElement(By.linkText("CRM/SFA"));
		elementLink.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
	
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Amazon");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("jeff");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("bezos");
		
		// Learning Dropdown selectByVisibleText
		
		WebElement elementSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(elementSource);
		source.selectByVisibleText("Employee");
		
		// Learning Dropdown selectByValue
		
		WebElement elementIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));	
		Select industry = new Select(elementIndustry);
		industry.selectByValue("IND_FINANCE");
		
		// Learning Dropdown selectByIndex
		
		WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(elementOwnership);
		ownership.selectByIndex(5);
		
	

	}

}
