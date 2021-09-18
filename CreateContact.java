package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//1. UserName Text Box
		WebElement usernameBox = driver.findElement(By.id("username"));
		usernameBox.sendKeys("demosalesmanager");
		//2..Password Text Box
		WebElement passwordBox = driver.findElement(By.id("password"));
		passwordBox.sendKeys("crmsfa");
		//3.. Login Button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		//4. Link Interaction
		WebElement crmsfaHyperLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaHyperLink.click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
				
		driver.findElement(By.id("firstNameField")).sendKeys("Naresh");
		driver.findElement(By.id("lastNameField")).sendKeys("Karthi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Arthi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Pavi");
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Miss.");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("08/24/98");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("M.Sc");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Selenium Automation Testing");
		
		WebElement currencyDropdown = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select Currency = new Select(currencyDropdown);
		Currency.selectByValue("INR");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("NONE");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("NONE");
		
		WebElement countryCode = driver.findElement(By.id("createContactForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("+91");
		
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("402");
		driver.findElement(By.id("createContactForm_primaryPhoneAskForName")).sendKeys("Arthi");
		driver.findElement(By.id("createContactForm_primaryPhoneExtension")).sendKeys("402");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("arthiyellow@gmail.com");
		driver.findElement(By.id("generalToNameField")).clear();
		driver.findElement(By.id("generalToNameField")).sendKeys("Arthi Pavi");
		driver.findElement(By.id("createContactForm_generalAttnName")).sendKeys("Arthi");
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("8,sivan Road");
		driver.findElement(By.id("createContactForm_generalAddress2")).sendKeys("cuddalore");
		
		WebElement countryDropdown = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select Country = new Select(countryDropdown);
		Country.selectByValue("India");
		
		WebElement stateDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select State = new Select(stateDropdown);
		State.selectByValue("NY");
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("NT");
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("604010");
		driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("32");
		
		driver.findElement(By.name("submitButton")).click();		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_importantNote")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is an Important Note!");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());
		
		

	}

}