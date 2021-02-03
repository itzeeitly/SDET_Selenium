package stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class NewSteps {
	WebDriver driver;
	@Given("We should be in home page")
	public void we_should_be_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ITISHREENAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@When("Enter valid name")
	public void enter_valid_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	@When("Enter valid passowrd and click")
	public void enter_valid_passowrd_and_click() throws InterruptedException {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
//	@When("Enter valid passowrd")
//	public void enter_valid_passowrd() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	}
//	@When("click login")
//	public void click_login() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(3000);
//	}
	@Then("Login successfull")
	public void login_successfull() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String s1 = driver.findElement(By.id("welcome")).getText();
		String s2 = "Welcome Paul";
		Assert.assertEquals(s1, s2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]"));
		
		driver.close();
	}
	
	
}
