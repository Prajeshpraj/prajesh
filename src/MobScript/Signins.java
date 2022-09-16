package MobScript;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjectmodule.Signinp;



public class Signins {

	//login
	@SuppressWarnings("deprecation")
	@Test(dataProvider="login")
    public void sign(String username,String Password) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajesh.j\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        Signinp sip=new Signinp(driver);
        sip.goTo();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        sip.s().click();
        Thread.sleep(2000);
        sip.u().sendKeys(username);
        Thread.sleep(2000);
        sip.p().sendKeys(Password);
        Thread.sleep(2000);
        sip.l().click();
        driver.close();
    }
    
    @DataProvider(name="login")
    public Object[][] getdata()
    {
        Object [][] data=new Object[4][2];
      data [0][0]="praj";
      data [0][1]="praj1008";
      data [1][0]="Jinu";
      data [1][1]="9677";
      data [2][0]="praj@1234 $";
      data[2][1]="Quali123";
      data[3][0]="@123J";
      data[3][1]="A";
      
      return data;
    }
}
