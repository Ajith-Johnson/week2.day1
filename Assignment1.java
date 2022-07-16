package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 											// setup the path driver
		ChromeDriver driver = new ChromeDriver();   										//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login"); 							//Load the URL
		driver.manage().window().maximize(); 												//maximize the browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));  				// Wait for sometime to enter
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");					//Enter the User name
		driver.findElement(By.id("password")).sendKeys("crmsfa");  							//Enter the password
		driver.findElement(By.className("decorativeSubmit")).click();						//click the login button using Class Locator
		driver.findElement(By.linkText("CRM/SFA")).click();									//click the CRM/SFA button using the locator linkText.
		driver.findElement(By.linkText("Leads")).click();									//click the Leads button using the locator linkText.
		driver.findElement(By.linkText("Create Lead")).click();								//click the Create Lead button using the locator linkText.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith");			//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Johnson J");			//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("AJ");			//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.name("departmentName")).sendKeys("Testing");					//Enter Department Field Using any Locator
		driver.findElement(By.name("description")).sendKeys("QA/Automation Test Engineer");	//Enter Description Field Using any Locator
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajithjohnson97@gmail.com");	//Enter your email in the E-mail address Field using any locator
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));		
		Select dropdown1 = new Select(State);
		dropdown1.selectByVisibleText("New York");											//Select State/Province as NewYork Using Visible Text
		driver.findElement(By.className("smallSubmit")).click();							//Click on Create Button using Class Locator
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}