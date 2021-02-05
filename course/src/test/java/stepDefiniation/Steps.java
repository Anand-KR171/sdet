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
		
	@When("Enter the valid name {string}")
	public void enter_the_valid_name(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("Click on the Validbutton")
	public void click_on_the_validbutton() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("I see the name as {string}")
	public void i_see_the_name_as(String string) throws InterruptedException {
//		String Ename=driver.findElement(By.id("welcome")).getText();
		String Aname="Welcome Paul";
		Assert.assertEquals(string, Aname);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.close();
	}
	@When("Enter the invalid name {string}")
	public void enter_the_invalid_name(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("Enter the invalid password {string}")
	public void enter_the_invalid_password(String string) {
			driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("Click on the Invlaidbutton")
	public void click_on_the_invlaidbutton() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("i want to see the invalid as {string}")
	public void i_want_to_see_the_invalid_as(String string) {
//		String EErron=driver.findElement(By.id("spanMessage")).getText();
		String AError="Invalid credentials";
		Assert.assertEquals(string, AError);
		driver.close();
	}
}
