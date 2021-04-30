import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchSuggestions {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> suglist = driver.findElement(By.className("erkvQe")).findElements(By.tagName("li"));

		System.out.println(suglist.size());

		for (int i = 0; i < suglist.size(); i++) {
			System.out.println((i + 1) + "." + suglist.get(i).getText());
		}

		System.out.println("Succesful");

		driver.quit();

	}

}
