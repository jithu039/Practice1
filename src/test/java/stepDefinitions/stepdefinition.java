//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//
//public class stepdefinition {
//	WebDriver driver= null;
//	
//	@Given("^i launch google chrome browser$")
//	public void i_launch_google_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//	
//	@When("^i open google homepage$")
//	public void i_open_google_homepage() {
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		//driver.findElement(By.xpath("//div[text()=\"Accept all\"]")).click();
//	
//	}
//	
//	@Then("^google homepage displayed$")
//	public void google_homepage_displayed() {
//		
//		String expectedPageTitle = "Google";
//		String actualPageTitle = driver.getTitle();
//		Assert.assertEquals(expectedPageTitle, actualPageTitle);
//		
//		
//		
//	}
//	
//	@And("^google search button is present$")
//	public void google_search_button_is_present() {
//		String exepectedOutput = "Google Search";
//		String actualOutput = driver.findElement(By.xpath("//input[@name='btnK']")).getAttribute("aria-label");
//		
//		Assert.assertEquals(exepectedOutput, actualOutput);
//		
//	}
//	 @And("^user serach for ipl$")
//	 public void user_serach_for_ipl() {
//		 
//		 WebElement Search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//		 Search.sendKeys("ipl" + Keys.ENTER);
//		 
//		 
//		 
//		 
//	 }
//	
//	
//	
//	
//
//}
