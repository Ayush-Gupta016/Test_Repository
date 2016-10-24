import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://172.29.8.74/login.aspx");
		driver.findElement(By.cssSelector("#txtUserid")).sendKeys("ayushg");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Damco@02");
		driver.findElement(By.cssSelector("#BtnLogin")).click();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='header']/div[1]/ul/li[1]/a")).click();
		
		Set<String> Allwindowhandles = driver.getWindowHandles();
		
		for(String windows1 : Allwindowhandles)
	//	System.out.println(Allwindowhandles.size());
		
		System.out.println(windows1.toString());
//		System.out.println(windows1.iterator());
//		System.out.println(Allwindowhandles.iterator().next());
		
		
	}

}
