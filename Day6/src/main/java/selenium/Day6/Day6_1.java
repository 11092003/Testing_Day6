package selenium.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'input-firstname\']")).sendKeys("Monisha");
	    driver.findElement(By.xpath("//*[@id=\'input-lastname\']")).sendKeys("M");
		driver.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("monishamuralidharan110092003@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\'input-password\']")).sendKeys("8183256m@r");
	    JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(By.name("newsletter")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		
	}
}
