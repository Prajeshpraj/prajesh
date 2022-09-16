package MobScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjectmodule.Signupp;

public class Signups {
	
	@Test(dataProvider="signup")
	public void sign(String firstname2,String lastname2,String email2,String password2,String date2,String phonenumber2,String shortbio2) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prajesh.j\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Signupp sp=new Signupp(driver);
		sp.goTo2();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		sp.s2().click();
		Thread.sleep(1000);
		sp.u2().click();
		Thread.sleep(1000);
		sp.f2().sendKeys(firstname2);
		Thread.sleep(1000);
		sp.l2().sendKeys(lastname2);
		Thread.sleep(1000);
		sp.e2().sendKeys(email2);
		Thread.sleep(1000);
		sp.p2().sendKeys(password2);
		Thread.sleep(1000);
		sp.d2().sendKeys(date2);
		Thread.sleep(1000);
		sp.g2().click();
		Thread.sleep(1000);
		sp.ph2().sendKeys(phonenumber2);
		Thread.sleep(1000);
		sp.sb2().sendKeys(shortbio2);
		Thread.sleep(1000);
		sp.li2().click();
		//driver.close();
	}
	@DataProvider(name="signup")
	public Object[][] getdata()
	{
		Object[][] data= new Object[1][7];
		data[0][0]="Prajesh";
		data[0][1]="SM";
		data[0][2]="praj@2001.com";
		data[0][3]="Praj@2354";
		data[0][4]="09/06/2012";
		data[0][5]="5353536636";
		data[0][6]="good things";
		
		return data;
		
	}

}
