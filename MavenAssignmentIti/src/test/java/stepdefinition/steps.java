package stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class steps {
	
	WebDriver driver;
		@Given("Give URL")
		public void give_url() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ITISHREENAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();			
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		}
		@When("Enter username {string}")
		public void enter_username(String string) {
		    driver.findElement(By.id("login")).sendKeys(string);
		}
		@When("Enter password and click login {string}")
		public void enter_password_and_click_login(String string) {
		    driver.findElement(By.id("password")).sendKeys(string);
		    driver.findElement(By.id("form-login_submitAuth")).click();
		}
		@Then("Verify the mail {string}")
		public void verify_the_mail(String string) {
		    driver.findElement(By.className("dropdown-toggle")).click();
		    String mail=driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")).getText();
		    System.out.print(mail);
		    driver.close();
		}
		
		@When("Do login {string} {string}")
		public void do_login(String string, String string2) throws InterruptedException {
			driver.findElement(By.id("login")).sendKeys(string);
			driver.findElement(By.id("password")).sendKeys(string2);
		    driver.findElement(By.id("form-login_submitAuth")).click();
		    Thread.sleep(3000);
		}
		
		@When("Go to inbox and click on compose")
		public void go_to_inbox_and_click_on_compose() throws InterruptedException {
			driver.findElement(By.className("dropdown-toggle")).click();
			driver.findElement(By.linkText("Inbox")).click();
			driver.findElement(By.xpath("//*[@id='toolbar']/div/div[1]/a[1]/img")).click();
			Thread.sleep(10000);
		}
		@When("Type message")
		public void type_message() throws InterruptedException {
			driver.findElement(By.className("select2-search__field")).sendKeys("Shanthi");
			Thread.sleep(2000);
			driver.findElements(By.className("select2-results__option")).get(0).click();
			Thread.sleep(2000);
			driver.findElement(By.id("compose_message_title")).sendKeys("Test Compose Option");
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("/html/body")).sendKeys("Hi Shanthi, Have a nice Day !");
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("/html/body")).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
			Thread.sleep(10000);		
		}
		@SuppressWarnings("deprecation")
		@Then("Verify message")
		public void verify_message() {
			String alert1=driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]")).getText();
			System.out.print(alert1);
			String alertmsg="The message has been sent to Test123 Test1234 (abcde123456)";
			Assert.assertEquals(alert1, alertmsg);
			driver.close();
			  
		}
}