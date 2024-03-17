package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkart1 {
	WebDriver driver= null;
	
	@Given("^i launch google chrome browser$")
	public void i_launch_google_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@When("i open the flipkart homepage")
	public void i_open_the_flipkart_homepage() {
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();
	}
	@Then("^give the \"(.*)\"$")
	public void give_the(String PhNumber) {
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(PhNumber);
	}
	@Then("click on request otp btn")
	public void click_on_request_otp_btn() {
	    driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	}



	

}
