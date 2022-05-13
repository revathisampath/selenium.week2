package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("revathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
	    driver.findElement(By.name("personalTitle")).sendKeys("cs");
	    driver.findElement(By.name("generalProfTitle")).sendKeys("ghju");
		driver.findElement(By.name("annualRevenue")).sendKeys("34000");
		driver.findElement(By.name("birthDate")).sendKeys("10/07/2000");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("548987");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("78905");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathisampath@01@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6578954320");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("ezhil");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.facebook.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("abcd");
		WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1=new Select(source);
		dd1.selectByVisibleText("Other");
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2=new Select(industry);
		dd2.selectByVisibleText("Press");
		driver.findElement(By.name("submitButton")).click();
		 String Title=driver.getTitle();
		 System.out.println(Title);
		 String name=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(name);
		 driver.close();

	}

}
