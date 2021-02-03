package stepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;
	@Given("we should be in the home page")
	public void we_should_be_in_the_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnandKR\\Desktop\\SDET Course\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("Enter the valid name")
	public void enter_the_valid_name() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	}
	@When("Enter the valid password and Click on the login button")
	public void enter_the_valid_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	/*@When("Click on the login button")
	public void click_on_the_login_button() {
		
	}*/
	@SuppressWarnings("deprecation")
	@Then("Login should be successfully")
	public void login_should_be_successfully() throws InterruptedException {
		String Ename=driver.findElement(By.id("welcome")).getText();
		String Aname="Welcome Paul";
		Assert.assertEquals(Ename, Aname);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.close();

	}
	
	@When("Enter the invalid name")
	public void enter_the_invalid_name() {
		driver.findElement(By.id("txtUsername")).sendKeys("anand");
	}
	@When("Enter the invalid password and Click on the login button")
	public void enter_the_invalid_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("anand");
		driver.findElement(By.id("btnLogin")).click();
	}
	/*@When("Click on the login button")
	public void click_on_the_login_button1() {
		
	}*/
	@SuppressWarnings("deprecation")
	@Then("Login should be unsuccessful")
	public void login_should_be_unsuccessful() {
		String EErron=driver.findElement(By.id("spanMessage")).getText();
		String AError="Invalid credentials";
		Assert.assertEquals(EErron, AError);
		driver.close();
	}
}
