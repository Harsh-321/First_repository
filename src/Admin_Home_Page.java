//This module is validate to check for the error message in the Fullname textbox


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Admin_Home_Page {
	WebDriver driver;
  @Test (priority=1)
  public void Test()  
  {
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		 /* driver.findElement(By.id("cyclosPassword")).click();*/
		  driver.findElement(By.xpath("//input[@value='1']")).click();
		  driver.findElement(By.xpath("//input[@value='2']")).click();
		  driver.findElement(By.xpath("//input[@value='3']")).click();
		  driver.findElement(By.xpath("//input[@value='4']")).click();
		  driver.findElement(By.xpath("//input[@value='Submit']")).click();
		  driver.findElement(By.id("memberUsername")).sendKeys("pinkubhui");
		 // driver.findElement(By.id("memberName")).sendKeys("Sai Charan");
			//  driver.findElement(By.id("memberName")).sendKeys("Harsh");
  }
  @Test (priority=2)
  public void personal() throws AWTException, InterruptedException{
		  Robot robot = new Robot();
		  Thread.sleep(3000);
		  robot.keyPress(KeyEvent.VK_DOWN);
		  
		   driver.findElement(By.xpath("//input[@linkurl='managePasswords?userId=3']")).click();
		
		   String expected = "Change login password of pinkubhui";
			  WebElement res = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
			  String actual = res.getText();
			  System.out.println(actual);
			  assertEquals(actual,expected);
  }
 



  @BeforeClass
  public void beforeClass() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	 driver.get("http://localhost:8585/");
  } 

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }



  

}
