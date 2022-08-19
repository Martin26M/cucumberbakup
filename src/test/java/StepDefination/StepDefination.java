package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.sql.Driver;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class StepDefination {
	 WebDriver driver;

    @Given("^When the user is on the LoginPage$")
    public void when_the_user_is_on_the_loginpage() throws Throwable {
     WebDriverManager.chromedriver().setup();
     driver  = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     
     
    }

    @When("^the user clicks on Login Button$")
    public void the_user_clicks_on_login_button() throws Throwable {
    
    	driver.findElement(By.id("email")).sendKeys("CheckLogin");
    	driver.findElement(By.id("pass")).sendKeys("CheckPass");
    //	driver.findElement(By.name("login")).click();
    }

    @Then("^user should be taken to Home Page$")
    public void user_should_be_taken_to_home_page() throws Throwable {
    	 System.out.println("I am on Home");
    }

    @And("^user should see the page title$")
    public void user_should_see_the_page_title() throws Throwable {
    	 System.out.println("I am on title");
    }

}