package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.get("http://www.leafground.com/pages/Button.html");		
		WebElement positionButton = driver.findElement(By.id("position"));
		Point xyPoint = positionButton.getLocation();
		int xValue = xyPoint.getX();
		int yValue = xyPoint.getY();
		System.out.println("The X value is "+xValue+" and the Y value is "+yValue);
		WebElement colouredBox = driver.findElement(By.id("color"));
		String color = colouredBox.getCssValue("background-color");
		System.out.println("Button Color is "+color);			
		WebElement sizeBox = driver.findElement(By.id("size"));
		Dimension dimensions = sizeBox.getSize();
		int height = dimensions.getHeight();
		int width = dimensions.getWidth();
		System.out.println("Height of the button is "+height);
		System.out.println("Width of the button is "+width);		.
		WebElement clickButton = driver.findElement(By.id("home"));
		clickButton.click();
		
	}

}
