package interviewprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIleDownload 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\Desktop\\webdriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver()	;
	driver.get("https:\\www.google.in");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("java downloads");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[9]/div[2]/div/div[2]/div[2]/div/div/div[1]/div[3]/div/div[1]/a/h3/span")).click();
	driver.findElement(By.xpath("//*[@id=\"ci-embed-CORE72DB7C84E7A94D5AA9F76FF4DF1F5FAA\"]/table/tbody/tr[3]/td[2]/a")).click();
	Robot robotobj=new Robot();
	robotobj.keyPress(KeyEvent.VK_TAB);
	robotobj.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	}

}
