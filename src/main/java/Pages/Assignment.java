package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public WebDriver driver;

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
	}

	public void form() throws InterruptedException {

		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("Tanmoy Mondal");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("tanmoy@gmail.com");

		WebElement current = driver.findElement(By.id("currentAddress"));
		current.sendKeys("Simform Solution Iscon");

		WebElement permanent = driver.findElement(By.id("permanentAddress"));
		permanent.sendKeys("Simform Solution Bopal");

		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		
		Thread.sleep(2000);
	}

	public String getName() {
		WebElement pname = driver.findElement(By.xpath("//p[@id='name']"));
		String name = pname.getText();
		System.out.println(name);
		return name;
	}

	public String getEmail() {
		WebElement pemail = driver.findElement(By.xpath("//p[@id='email']"));
		String email = pemail.getText();
		System.out.println(email);
		return email;
	}

	public String getCurrentAddress() {
		WebElement pcurrent = driver.findElement(By.xpath("//p[@id='currentAddress']"));
		String current = pcurrent.getText();
		System.out.println(current);
		return current;
	}

	public String getPermanentAddress() {
		WebElement ppermanent = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
		String permanent = ppermanent.getText();
		System.out.println(permanent);
		return permanent;
	}

	public void closeBrowser() {
		driver.quit();
	}

}
