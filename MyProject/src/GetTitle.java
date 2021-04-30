import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {

		String Expected = "Google Images";
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();
		String Actual = driver.getTitle();
		
		if(Expected.equalsIgnoreCase(Actual))
		{
			System.out.println(Actual+ " "+ Expected+" Passed");
		}
		else
		{
			System.out.println(Actual+ " "+ Expected+" Failed");
		}
		
		driver.close();
	}

}
