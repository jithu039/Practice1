//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.idealized.Javascript;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class stepDefinition2 {
//	
//		WebDriver driver= null;
//		
//		@Given("^i launch google chrome browser$")
//		public void i_launch_google_chrome_browser() {
//			System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//		
//		@When("i open the freeCRM homepage")
//		public void i_open_the_free_crm_homepage() {
//			driver.get("https://freecrm.com/");
//			driver.manage().window().maximize();
//		    
//		}
//		@And("user clicks on login button")
//		public void user_clicks_on_login_button() {
//			//WebElement loginbtn 
//			driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
////		    JavascriptExecutor js = (JavascriptExecutor) driver;
////		    js.executeScript("arguments[0].click()","loginbtn");
//		}
//		
//		
//		@Then("^give the \"(.*)\" and \"(.*)\"$")
//		public void give_the_and(String username, String password) {
//			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
//			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//		    
//		}
//		@Then("click on loginbtn")
//		public void click_on_loginbtn() {
//		    driver.findElement(By.xpath("//div[text()='Login']")).click();
//		}
//
//
//
//	
//
//}
