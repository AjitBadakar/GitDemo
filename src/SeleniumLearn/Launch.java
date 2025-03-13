package SeleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement sr = driver.findElement(By.id("APjFqb"));
		sr.sendKeys("testing");
		sr.sendKeys(Keys.ENTER);

	}

}
