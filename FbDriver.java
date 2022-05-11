package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("firstname")).sendKeys("revathi");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.id(" reg_email")).sendKeys("Demo@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("5550");
		
		WebElement date= driver.findElement(By.id("Date"));
		Select dob1=new Select(date);
		dob1.selectByValue("10");
		WebElement month=driver.findElement(By.id("month"));
		Select dob2=new Select(month);
		dob2.selectByValue("7");
		WebElement year=driver.findElement(By.id("year"));
		Select dob3=new Select(year);
		dob3.selectByValue("2000");
		
		
	}

}
