package StepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef 
{
	
	WebDriver driver;
   @Given ("^user opens the browser$")
   public void Login()
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\Gourav\\Personal\\Study\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://supporttst1.taleo.net");
   }
   @When("^provide credentials$")
   public void cred()
   {
	   driver.findElement(By.xpath("//input[@id = 'dialogTemplate-dialogForm-content-login-name1']")).sendKeys("support");
	   driver.findElement(By.id("dialogTemplate-dialogForm-content-login-password")).sendKeys("wLvf2s95YPfKAk");
	   
	   
   }
   @Then("^he will be able to login$")
   public void loggedin()
   {
	   driver.findElement(By.xpath("//span[contains(text(),'Sign In(367577)')]")).click();
   }
}
