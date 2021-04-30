import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		driver.findElement(By.id("RoundTrip")).click();
		
		System.out.println(radio.size());
		
		for(int i=0; i< radio.size();i++)
		{
			System.out.println(radio.get(i).getAttribute("value"));
		}
		
		
		driver.close();

	}

}
