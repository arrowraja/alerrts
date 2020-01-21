package org.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Desktop\\raja\\Day8\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		a.accept();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		a.sendKeys("captainamerica");
		Thread.sleep(8000);
		a.accept();*/
		
		/*driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();	
		driver.switchTo().frame(driver.findElement(By.xpath("(//frame[@marginwidth='0'])[1]")));
		driver.findElement(By.xpath("//img[@style='margin-right:18px;']")).click();
		Alert x = driver.switchTo().alert();
		x.accept();*/
		
	/*	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert x = driver.switchTo().alert();
		x.accept();*/
		
	/*	driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
		driver.findElement(By.id("Button2")).click();
		Alert c = driver.switchTo().alert();
		Thread.sleep(4000);
		c.accept();*/
		
	/*	driver.get("https://www.sprint.com/");
		driver.findElement(By.xpath("//a[@title='Sign In']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("loginHeaderButton")).click();*/
		
	/*	driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']")));
		driver.findElement(By.xpath("//span[contains(text(),'Login/Signup')]")).click();
		driver.findElement(By.id("input_0")).sendKeys("1234567890");
		driver.findElement(By.id("input_1")).sendKeys("daredevil");*/
		
	/*	driver.get(" https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("(//frame[@marginheight='0'])[1]")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1245667");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("send");*/
		
		/*driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.findElement(By.xpath("//input[@name='DUMMY1']")).click();
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("1245");
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("daredevil");*/
		
		
		
		
		
		
		
		}

}
