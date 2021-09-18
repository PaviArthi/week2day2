package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait of 10 seconds
		
		driver.get("https://en-gb.facebook.com/"); //URL to be tested
		
		driver.findElement(By.xpath("//form[@class='_9vtf']/div[5]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arthi");
		driver.findElement(By.name("lastname")).sendKeys("Pavi");
		driver.findElement(By.name("reg_email__")).sendKeys("arthiyellow@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("arthiyellow@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("arthipavi");
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDate = new Select(day);
		selectDate.selectByValue("24");		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("8");		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("1998");		
		driver.findElement(By.xpath("//input[@value='1']")).click();		
		driver.findElement(By.name("websubmit")).click();

	}

}