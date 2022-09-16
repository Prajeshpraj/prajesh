package MobScript;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




import Pageobjectmodule.homepagep;



public class homepages{
    @Test
    
      public void home() throws InterruptedException
      {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajesh.j\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          homepagep hp= new homepagep(driver);
          hp.goTo();
          hp.h1();
          hp.lands();
          hp.allmob();
          hp.homesupport();
          hp.scrollDown();
          hp.downlinks1();
      }

	



}