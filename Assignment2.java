package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive = new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		drive.findElement(By.id("username")).sendKeys("demosalesmanager");					//Enter the User name using id Locator
		drive.findElement(By.id("password")).sendKeys("crmsfa");  							//Enter the password using id Locator
		drive.findElement(By.className("decorativeSubmit")).click();						//click the login button using Class Locator
		drive.findElement(By.linkText("CRM/SFA")).click();									//click the CRM/SFA button using the locator linkText.
		drive.findElement(By.linkText("Leads")).click();									//click the Leads button using the locator linkText.
		drive.findElement(By.linkText("Create Lead")).click();								//click the Create Lead button using the locator linkText.
		drive.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 		//Enter CompanyName Field Using id Locator
		drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith");			//Enter FirstName Field Using id Locator
		drive.findElement(By.id("createLeadForm_lastName")).sendKeys("Johnson J");			//Enter LastName Field Using id Locator
		drive.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("AJI");			//Enter FirstName(Local) Field Using id Locator
		drive.findElement(By.name("departmentName")).sendKeys("Testing");					//Enter Department Field Using any Locator
		drive.findElement(By.name("description")).sendKeys("QA/Automation Test Engineer");	//Enter Description Field Using any Locator
		drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajithjohnson97@gmail.com");	//Enter your email in the E-mail address Field using any locator
		WebElement Province = drive.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop1 = new Select (Province);
		drop1.selectByVisibleText("New York");
		drive.findElement(By.className("smallSubmit")).click();
		drive.findElement(By.linkText("Duplicate Lead")).click();									//Click on Duplicate button using the locator linkText.
		drive.findElement(By.id("createLeadForm_companyName")).clear();								//Clear the Company Name Field using .clear()
		drive.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");					//Enter new Company Name
		drive.findElement(By.id("createLeadForm_firstName")).clear();								//Clear the First Name Field using .clear()
		drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith AJ");					//Enter new First Name
		drive.findElement(By.className("smallSubmit")).click();										//Click on Create Lead Button
		
		String TitleofthePage = drive.getTitle();									//Title of Resulting Page using driver.getTitle()
		System.out.println(TitleofthePage);

	}

}
