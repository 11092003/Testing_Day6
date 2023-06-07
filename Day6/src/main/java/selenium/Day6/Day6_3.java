package selenium.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_3 {
 

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("727821tuee054@skct.edu.in");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("8183256m@r");
		WebElement checkBoxElement1 = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]"));
		boolean isSelected1 = checkBoxElement1.isSelected();
		if(isSelected1 == false) {
			checkBoxElement1.click();
		}
		WebElement checkBoxElement2 = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]"));
		boolean isSelected2 = checkBoxElement2.isSelected();
		if(isSelected2 == false) {
			checkBoxElement2.click();
		}
		WebElement checkBoxElement3 = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Mouse\"]"));
		boolean isSelected3 = checkBoxElement3.isSelected();
		if(isSelected3 == false) {
			checkBoxElement3.click();
		}
		WebElement checkBoxElement4 = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Scanner\"]"));
		boolean isSelected4 = checkBoxElement4.isSelected();
		if(isSelected4 == false) {
			checkBoxElement4.click();
		}
	}
}
