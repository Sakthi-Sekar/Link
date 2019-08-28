package Selenium.com.atmecs.utilitypackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import java.util.*;
	public class LinkWeb {
	@Test
	public void link() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sakthi.sekar\\eclipse-workspace\\com.atmecs.task\\lib\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://www.orangehrm.com");

	List<WebElement> links = driver.findElements(By.tagName("a"));

	System.out.println(links.size());

	for (int i = 1; i<=links.size(); i=i+1)

	{

	System.out.println(links.get(i).getText());

	}

	}
}
