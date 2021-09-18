package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.leafground.com/pages/Edit.html");				
		WebElement eMailBox = driver.findElement(By.id("email"));
		eMailBox.sendKeys("ennkaeyy@gmail.com");				
		WebElement appendWordBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		appendWordBox.sendKeys("If you see this, this is Appended!");	
		 WebElement textBox = driver.findElement(By.name("username"));
		String text = textBox.getAttribute("value");
		System.out.println(text);		
		WebElement clearTextBox = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		clearTextBox.clear(); 		
		WebElement disableBox = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean disableStatus = disableBox.isEnabled();
		System.out.println(disableStatus);
		
		
	}

}