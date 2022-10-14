package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentEditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
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
	
		WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
		elementFindLeads.click();
		
		WebElement elementFirstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		elementFirstName.sendKeys("Jeff");
		
		WebElement elementFindLeadsButton = driver.findElement(By.xpath("//button[text() ='Find Leads']"));
		elementFindLeadsButton.click();
		
		Thread.sleep(2000);
		
		WebElement elementResultingLead = driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10695'])[1]"));
		elementResultingLead.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement elementEdit = driver.findElement(By.linkText("Edit"));
		elementEdit.click();
		
		WebElement elementUpdateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		elementUpdateCompanyName.clear();
		elementUpdateCompanyName.sendKeys("Microsoft");
		
		WebElement elementUpdateButton = driver.findElement(By.name("submitButton"));
		elementUpdateButton.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));		
		String companyNameVerification = elementCompanyName.getText();
		if(companyNameVerification.contains("Microsoft"))
			System.out.println("The company Name is Verified");
		else
			System.out.println("Error");
		driver.close();
	}

}
